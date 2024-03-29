package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

public class InsertValues {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	public static void insertIntoHotelTable(int number) throws Throwable {

		String sql = "INSERT INTO Hotels (hotel_name, hotel_location,created_date,updated_date,is_Active) values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number of data you want to add:");
		// int userInput = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sql);

			for (int i = 1; i <= number; i++) {
				Random rn = new Random();
				Integer randomNumber = (Integer) rn.nextInt(100000);
				String name = "Shirin" + randomNumber;
				String location = "Muttrah" + randomNumber;
				// Creating object of date class
				// Date d1 = new Date();

				// System.out.println(name);
				boolean numberToAdd = true;
				// pstmt.setInt(1, i);
				pstmt.setString(1, name);
				pstmt.setString(2, location);
				// pstmt.setDate(4, d1);
				pstmt.setDate(3, new Date(System.currentTimeMillis()));
				pstmt.setDate(4, new Date(System.currentTimeMillis()));

				pstmt.setBoolean(5, numberToAdd);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted in Hotel Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End of insertIntoHotelTable Function

	public static void insertIntoRoomsTypeTable() throws Throwable {
		String sqlRT = "INSERT INTO Room_Type (room_type_name, created_date, updated_date,is_Active) values (?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sqlRT);

			for (int i = 1; i <= number; i++) {
				String RoomTypeName = "STANDARD";
				String RoomTypeName2 = "DELUXE";
				String RoomTypeName3 = "SUITE";

				boolean numberToAdd = true;
				// pstmt.setInt(1, i);
				pstmt.setString(1, RoomTypeName3);
				pstmt.setDate(2, new Date(System.currentTimeMillis()));
				pstmt.setDate(3, new Date(System.currentTimeMillis()));

				pstmt.setBoolean(4, numberToAdd);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted in Room Type Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End of insertIntoRoomsTypeTable Function

	public static void insertIntoRoomsTable() throws Throwable {

		String sqlR = "INSERT INTO Rooms values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);

			pstmt = (PreparedStatement) con.prepareStatement(sqlR);

			for (int i = 1; i <= number; i++) {

				boolean numberToAddR = true;

				pstmt.setInt(1, i);
				pstmt.setInt(2, i);
				pstmt.setDate(3, new Date(System.currentTimeMillis()));
				pstmt.setDate(4, new Date(System.currentTimeMillis()));

				pstmt.setBoolean(5, numberToAddR);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End insertIntoRoomsTable Function

	public static void insertIntoGuestsTable() throws Throwable {

		String sqlGuests = "INSERT INTO Guests values (?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);

			pstmt = (PreparedStatement) con.prepareStatement(sqlGuests);

			for (int i = 1; i <= number; i++) {

				boolean numberToAddGuests = true;
				String GuestName = "Jizelle";
				String GuestPhone = "+96876243561";

				Random rn = new Random();
				Integer randomNumber = (Integer) rn.nextInt(200);
				Integer randomNumber1 = (Integer) rn.nextInt(10005);
				Integer guest_accompanying_members = randomNumber;
				Integer guest_payment_amount = randomNumber1;

				pstmt.setString(1, GuestName);
				pstmt.setString(2, GuestPhone);
				pstmt.setInt(3, guest_accompanying_members);
				pstmt.setInt(4, guest_payment_amount);
				pstmt.setInt(5, 12); // since it is forign key given the ID
				pstmt.setInt(6, 13); // since it is forign key given the ID
				pstmt.setDate(7, new Date(System.currentTimeMillis()));
				pstmt.setDate(8, new Date(System.currentTimeMillis()));
				pstmt.setBoolean(9, numberToAddGuests);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End insertIntoGuestsTable Function

	public static void insertIntoEmployeeTypeTable() throws Throwable {

		String sqlGuests = "INSERT INTO Employee_Type values (?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);

			pstmt = (PreparedStatement) con.prepareStatement(sqlGuests);

			for (int i = 1; i <= number; i++) {

				boolean numberToAddET = true;
				String EmployeeType1 = "MANAGER";
				String EmployeeType2 = "ATTENDANT";
				String EmployeeType3 = "VALET";
				String EmployeeType4 = "BUTLER";
				String EmployeeType5 = "DIRECTOR";

				pstmt.setString(1, EmployeeType5);
				pstmt.setDate(2, new Date(System.currentTimeMillis()));
				pstmt.setDate(3, new Date(System.currentTimeMillis()));
				pstmt.setBoolean(4, numberToAddET);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End insertIntoEmployeeTypeTable Function

	public static void insertIntoEmployeeTable() throws Throwable {

		String sqlEmployee = "INSERT INTO Employees values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records you want to add :");
		int number = sc.nextInt();

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = (PreparedStatement) con.prepareStatement(sqlEmployee);

			for (int i = 1; i <= number; i++) {

				boolean numberToAddEmployee = true;

				pstmt.setInt(1, 1); // since it is forign key given the ID
				pstmt.setInt(2, 1);// since it is forign key given the ID
				pstmt.setDate(3, new Date(System.currentTimeMillis()));
				pstmt.setDate(4, new Date(System.currentTimeMillis()));
				pstmt.setBoolean(5, numberToAddEmployee);
				pstmt.executeUpdate();
			}

			System.out.println(number + " Records Inserted Successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}// End of insertIntoEmployeeTable Function

}// End of Insert Values Class
