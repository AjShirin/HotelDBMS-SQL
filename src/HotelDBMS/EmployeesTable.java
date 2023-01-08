package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class EmployeesTable {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void createEmployeesTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createEmployeeTable = "CREATE TABLE Employees " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " employee_type_id INTEGER FOREIGN KEY REFERENCES Employee_Type(id), "
					+ " room_type_id INTEGER FOREIGN KEY REFERENCES Rooms(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active bit NOT NULL)";

			stmt.executeUpdate(createEmployeeTable);
			System.out.println("Created table Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertIntoEmployeeTable() throws Throwable {

		String sql = "INSERT INTO Employees values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sql);

			for (int i = 1; i <= number; i++) {
				
				boolean numberToAdd = true;
				
				pstmt.setInt(2, i);
				
				pstmt.setDate(3, new Date(System.currentTimeMillis()));
				pstmt.setDate(4, new Date(System.currentTimeMillis()));

				pstmt.setBoolean(5, numberToAdd);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}// close class