package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

public class InsertHotels {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	public static void insertIntoTable() throws Throwable {

		String sql = "INSERT INTO Hotels (id, hotel_name, hotel_location,created_date,updated_date,is_Active) values (?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of data you want to add:");
		int userInput = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sql);

			for (int i = 1; i <= userInput; i++) {
				Random rn = new Random();
				Integer randomNumber = (Integer) rn.nextInt(100000);
				String name = "Shirin" + randomNumber;
				String location = "Ruwii" + randomNumber;
				// Creating object of date class
				// Date d1 = new Date();

				System.out.println(name);
				boolean numberToAdd = true;
				pstmt.setInt(1, i);
				pstmt.setString(2, name);
				pstmt.setString(3, location);
//	                pstmt.setDate(4, d1);
				pstmt.setDate(4, new Date(System.currentTimeMillis()));
				pstmt.setDate(5, new Date(System.currentTimeMillis()));

				pstmt.setBoolean(6, numberToAdd);
				pstmt.executeUpdate();
			}

			System.out.println(userInput + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
