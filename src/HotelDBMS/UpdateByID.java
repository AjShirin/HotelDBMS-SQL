package HotelDBMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateByID {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	public static void makeIsActiveFalseById() throws Throwable {

		String sqlUpdate = "UPDATE Hotels " + "SET is_Active = 0 " + "WHERE id = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sqlUpdate);

//	        try (Connection conn = MySQLJDBCUtil.getConnection();
//	                PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

			// prepare data for update
			System.out.println("Enter the ID Number you want to update :");
			int userInputID = sc.nextInt();

			pstmt.setInt(2, userInputID);

			int rowAffected = pstmt.executeUpdate();
			System.out.println(String.format("Row affected %d", rowAffected));

//	            // reuse the prepared statement
//	            lastName = "Grohe";
//	            id = 101;
//	            pstmt.setString(1, lastName);
//	            pstmt.setInt(2, id);
//
//	            rowAffected = pstmt.executeUpdate();
//	            System.out.println(String.format("Row affected %d", rowAffected));

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
