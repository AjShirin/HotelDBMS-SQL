package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateRoomTypeTable {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void createRoomTypeTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createRoomTypeTable = "CREATE TABLE Room_Type " + "(id INTEGER PRIMARY KEY, "
					+ " room_type_name VARCHAR(50) NOt NULL, " + " created_date date, " + " updated_date date, "
					+ " is_Active bit NOT NULL)";

			stmt.executeUpdate(createRoomTypeTable);
			System.out.println("Created table Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
