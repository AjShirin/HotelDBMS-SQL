package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class UpdateRecord {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void updateHotelById() throws IOException {

		String sql = "UPDATE Hotels SET hotel_name = ?, hotel_location = ?,created_date = ?, updated_date = ? WHERE id = ?";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the ID Number you want to Update :");
		int userInputID = sc.nextInt();
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "William Henry Bill Gates");
			pstmt.setString(2, "Muscat");
			pstmt.setDate(3, new Date(System.currentTimeMillis()));
			pstmt.setDate(4, new Date(System.currentTimeMillis()));
			pstmt.setInt(5, userInputID);
			pstmt.executeUpdate();

			String byID = "SELECT * FROM Hotels WHERE id = ?";

			PreparedStatement pstmt2 = con.prepareStatement(byID);
			pstmt2.setInt(1, userInputID);
			ResultSet rs = pstmt2.executeQuery();
			if (rs.next()) {

				String hotel_name = rs.getString(2);
				String hotel_location = rs.getString(3);
				Date created_date = rs.getDate(4);
				Date update_date = rs.getDate(5);
				boolean is_Active = rs.getBoolean(6);
				
				System.out.println("Record Updated Successfully :) !!");

				System.out.println("Id :" + userInputID + "||" + " " + "Hotel Name :" + hotel_name + "||" + " "
						+ "Hotel Location :" + hotel_location + "||" + " " + "Created date is :" + created_date + "||"
						+ " " + "Updated date is :" + update_date + "||" + "\n " + "The activation of the user is: "
						+ is_Active);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	} // End of updateHotelById Function
}// End of UpdateRecord Class
