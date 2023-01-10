package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void deleteHotelById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Delete :");
			int userInputID = sc.nextInt();
			String SQL = "DELETE FROM Hotels WHERE id = '" + userInputID + "'";
			System.out.println("Record :" + userInputID + " " + "deleted Successfully!! :)");
			ResultSet rs = st.executeQuery(SQL);

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of deleteHotelById Function

	static void deleteRoomTypeById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Delete :");
			int userInputID2 = sc.nextInt();
			String SQL2 = "DELETE FROM Room_Type WHERE id = '" + userInputID2 + "'";
			System.out.println("Record : " + userInputID2 + " " + "deleted From Room_Type Table Successfully!! :)");
			ResultSet rs = st.executeQuery(SQL2);

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of deleteRoomTypeById Function

	static void deleteRoomById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Delete :");
			int userInputIDRooms = sc.nextInt();
			String SQLRooms = "DELETE FROM Rooms WHERE id = '" + userInputIDRooms + "'";
			System.out.println("Record : " + userInputIDRooms + " " + "deleted From Rooms Table Successfully!! :)");
			ResultSet rs = st.executeQuery(SQLRooms);

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of deleteRoomById Function

	static void deleteGuestById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Delete :");
			int userInputIDGuests = sc.nextInt();
			String SQLGuests = "DELETE FROM Guests WHERE id = '" + userInputIDGuests + "'";
			System.out.println("Record : " + userInputIDGuests + " " + "deleted From Guests Table Successfully!! :)");
			ResultSet rs = st.executeQuery(SQLGuests);

		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of deleteGuestById Function

}// End of Delete Record Function
