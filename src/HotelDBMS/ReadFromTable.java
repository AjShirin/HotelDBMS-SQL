//package HotelDBMS;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class ReadFromTable {
//	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
//	static final String USER = "sa";
//	static final String PASS = "root";
//
//	static void readFromTableFunction() throws IOException {
//		Connection con = null;
//		try {
//			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//
//			DriverManager.registerDriver(driver);
//
//			con = DriverManager.getConnection(DB_URL, USER, PASS);
//			Statement st = con.createStatement();
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the numbers of rows you want to see :");
//			int userInputID = sc.nextInt();
//			String SQL = "SELECT * FROM Hotels";
//			System.out.println("The record has been deactivated successfully :) !!");
//			ResultSet rs = st.executeQuery(SQL);
//			// System.out.println("Record deleted Successfully!! :)");
//		} catch (Exception ex) {
//			System.err.println(ex);
//		}
//	}
//}
//
