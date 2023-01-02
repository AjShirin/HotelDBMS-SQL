package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createEmployeesTable {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void createEmployeesTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createEmployeeTable = "CREATE TABLE Employees " + "(id INTEGER PRIMARY KEY, "
					+ " employee_type_id INTEGER FOREIGN KEY REFERENCES Employee_Type(id), "
					+ " room_id INTEGER FOREIGN KEY REFERENCES Hotels(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active bit NOT NULL)";

			stmt.executeUpdate(createEmployeeTable);
			System.out.println("Created table Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}