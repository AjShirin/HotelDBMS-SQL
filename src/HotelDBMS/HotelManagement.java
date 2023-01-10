package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class HotelManagement {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void guestEndWith_E() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			String SQL = "SELECT * FROM Guests \r\n" + "WHERE guest_name LIKE '%E'";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				String Room_Name = rs.getString(1);
				System.out.println("Guest Name That Ends With E is:" + " " + Room_Name);
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of guestEndWith_E

	static void guestPayingMoreThan100() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			
			String SQL = "SELECT * FROM Guests \r\n" + "WHERE guest_payment_amount > '1000'";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				int id = rs.getInt(1);
				String guest_name = rs.getString(2);
				String guest_phone = rs.getString(3);
				int guest_accompanying_members = rs.getInt(4);
				int guest_payment_amount = rs.getInt(5);
				int room_id = rs.getInt(6);
				int hotel_id = rs.getInt(7);
				Date create_date = rs.getDate(8);
				Date update_date = rs.getDate(9);
				String is_Active = rs.getString(10);
				System.out.println("Id :" + id + "||" + " " + "Guest name is  :" + guest_name + "||" + " "
						+ "Guest Phone Number is :" + guest_phone + "||" + " " + "\n "
						+ "Guest Accompanying Members is :" + guest_accompanying_members + "||" + " "
						+ "Guest Payment Amount is :" + guest_payment_amount + "||" + " " + "Room ID is :" + room_id
						+ "||" + " " + "Hotel ID is :" + hotel_id + "||" + " " + "\n " + "Created Date is  :"
						+ create_date + "||" + " " + "Updated date is : " + update_date + "||" + "\n "
						+ "The activation of the user is: " + is_Active);
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of guestEndWith_E 
	
	static void dulexRoom() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();

			String SQL = "SELECT COUNT(room_type_name) As Total_Dulex_Rooms FROM Room_Type \r\n" + "WHERE room_type_name = 'DELUXE'";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				
					String Room_Name = rs.getString(1);
					System.out.println("Count of guests who are staing in 'DELUXE' rooms :\r\n"
							 + " " + Room_Name);
				
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of dulexRoom 

	static void employeesWithName_A() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
		
			String SQL = "SELECT * FROM Guests \r\n" + "WHERE guest_name Like '%A%'";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				
					int GuestID = rs.getInt(1);
					String GuestName = rs.getString(2);
					System.out.println("id:"+ ""+GuestID +" "+"Guest Name who have 'A' in their Nameis :\r\n"
							 + " " + GuestName);
				
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of dulexRoom 
}// End of Class
