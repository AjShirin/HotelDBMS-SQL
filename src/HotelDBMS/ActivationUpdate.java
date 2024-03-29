package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ActivationUpdate {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void makeIsActiveFalseById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Deactivate :");
			int userInputID = sc.nextInt();
			String SQL = "UPDATE Hotels SET is_Active = 0  WHERE id =" + userInputID;
			System.out.println("The record has been deactivated successfully :) !!");
			ResultSet rs = st.executeQuery(SQL);
			System.out.println("Record Deactivated Successfully!! :)");
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of makeIsActiveFalseById Function

	static void makeIsActiveFalseByIdTen() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Deactivate :");
			int userInputID = sc.nextInt();
			String SQL = "UPDATE Hotels SET is_Active = 0  WHERE id <=" + userInputID;
			System.out.println("10 Record Deactivated Successfully!! :)");
			ResultSet rs = st.executeQuery(SQL);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	} // End of makeIsActiveFalseByIdTen Function

	static void makeIsActiveTrueByIdTen() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Activate :");
			int userInputID = sc.nextInt();
			String SQL = "UPDATE Hotels SET is_Active = 1  WHERE id <=" + userInputID;
			System.out.println("10 Record Activated Successfully!! :)");
			ResultSet rs = st.executeQuery(SQL);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	} // End of makeIsActiveTrueByIdTen Function
	
	static void makeRoomTypeIsActiveFalseById() throws IOException {
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID Number you want to Deactivate :");
			int userInputID = sc.nextInt();
			String SQLRT = "UPDATE Room_Type SET is_Active = 0  WHERE id =" + userInputID;
			System.out.println("The Record Deactivated Successfully :) !!");
			ResultSet rs = st.executeQuery(SQLRT);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}// End of makeIsActiveFalseById Function
	
	
} // End of ActivationUpdate Class
