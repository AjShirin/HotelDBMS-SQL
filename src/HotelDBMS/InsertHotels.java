package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class InsertHotels {
	public static  void Insert() throws IOException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";

	        String sql = "INSERT INTO Hotels (id, hotel_name, hotel_location,created_date,updated_date,is_Active) VALUES (?, ?, ?,?, ?, ?)";
	        Connection con = null;
			PreparedStatement pstmt = null;
	  
	  
	        try {
	        	   Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		            // Registering drivers
		            DriverManager.registerDriver(driver);
		            // Reference to connection interface
		            con = DriverManager.getConnection(url, user,
		                    pass);
		        	pstmt = (PreparedStatement) con.prepareStatement(sql);
		        	
		        	Scanner sc = new Scanner (System.in);
		        	System.out.println("Enter the number of data you want to add:");
		        	int userInput = sc.nextInt();

		        	
	            for (int i = 0; i < userInput; i++) {
	                Random rn = new Random();
	                int id = rn.nextInt(100);
	                String name = "Shirin" + id;
	                boolean numberToAdd = true;
	                pstmt.setInt(1, id);
	                pstmt.setString(2, name);
	                pstmt.setString(3, name);
	                pstmt.setDate(4, (java.sql.Date) new Date(System.currentTimeMillis()));
	                pstmt.setDate(5, (java.sql.Date) new Date(System.currentTimeMillis()));
	                pstmt.setBoolean(6, numberToAdd);
	                pstmt.executeUpdate();}
	          
	            System.out.println(userInput  + " Inserted Successfully!");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}









