package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
}// End of Class
