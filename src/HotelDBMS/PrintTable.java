package HotelDBMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class PrintTable {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	public static void readFromTable(int number) throws Throwable {

		int count = 0;
		String sql = "SELECT * FROM Hotels";
		Connection con = null;
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next() && count < number) {
				int id = result.getInt(1);
				String hotel_name = result.getString(2);
				String hotel_location = result.getString(3);
				Date created_date = result.getDate(4);
				Date update_date = result.getDate(5);
				boolean is_Active = result.getBoolean(6);
				System.out.println("Id :" + id + "||" + " " + "Hotel Name :" + hotel_name + "||" + " "
						+ "Hotel Location :" + hotel_location + "||" + " " + "Created date is :" + created_date + "||"
						+ " " + "Updated date is :" + update_date + "||" + "\n " + "The activation of the user is: "
						+ is_Active);
				count++;
			}
			con.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void readFromTableByUser() throws Throwable {

		int count = 0;
		String sql = "SELECT * FROM Hotels";

		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many records you want to view?");
			int useInputNumber = sc.nextInt();

			while (result.next() && count <= useInputNumber) {
				int id = result.getInt(1);
				String hotel_name = result.getString(2);
				String hotel_location = result.getString(3);
				Date created_date = result.getDate(4);
				Date update_date = result.getDate(5);
				boolean is_Active = result.getBoolean(6);
				System.out.println("Id :" + id + "||" + " " + "Hotel Name :" + hotel_name + "||" + " "
						+ "Hotel Location :" + hotel_location + "||" + " " + "Created date is :" + created_date + "||"
						+ " " + "Updated date is :" + update_date + "||" + "\n " + "The activation of the user is: "
						+ is_Active);
				count++;
			}
			con.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}