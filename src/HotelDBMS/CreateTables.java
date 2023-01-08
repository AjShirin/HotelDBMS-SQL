package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void createHotelTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createHotelTabel = "CREATE TABLE Hotels " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " hotel_name VARCHAR(50) NOt NULL, " + " hotel_location VARCHAR(50), "
					+ " created_date date NOT NULL, " + " updated_date date, " + "is_Active tinyint NOT NULL)";

			stmt.executeUpdate(createHotelTabel);
			System.out.println("Hotel Table Created Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createHotelTable Function

	static void createRoomTypeTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createRoomTypeTable = "CREATE TABLE Room_Type " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " room_type_name VARCHAR(50) NOt NULL, " + " created_date date, " + " updated_date date, "
					+ " is_Active tinyint NOT NULL)";

			stmt.executeUpdate(createRoomTypeTable);
			System.out.println("Room Type Table Created Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // close createRoomTypeTable Function

	static void createRoomsTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createRoomsTable = "CREATE TABLE Rooms " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " room_type_id INTEGER FOREIGN KEY REFERENCES Room_Type(id), "
					+ " hotel_id INTEGER FOREIGN KEY REFERENCES Hotels(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active tinyint NOT NULL)";

			stmt.executeUpdate(createRoomsTable);
			System.out.println("Rooms Table Created table Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createRoomsTable Function

	static void createGuestsTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createGuestsTable = "CREATE TABLE Guests " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " guest_name VARCHAR(50) NOT NULL, " + " guest_phone VARCHAR(50) NOT NULL, "
					+ " guest_accompanying_members INTEGER NOT NULL, " + " guest_payment_amount INTEGER NOT NULL,"
					+ " room_id INTEGER FOREIGN KEY REFERENCES Rooms(id), "
					+ " hotel_id INTEGER FOREIGN KEY REFERENCES Hotels(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active tinyint NOT NULL)";

			stmt.executeUpdate(createGuestsTable);
			System.out.println("Guests Table Created Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // close createGuestsTable Function

	static void createEmployeeTypeTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createEmployeeTypeTable = "CREATE TABLE Employee_Type " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " employee_type_name VARCHAR(50) NOT NULL, " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active tinyint NOT NULL)";
			stmt.executeUpdate(createEmployeeTypeTable);
			System.out.println("Employee Type Table Created Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createEmployeeTypeTable Function

	static void createEmployeesTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createEmployeeTable = "CREATE TABLE Employees " + "(id INTEGER PRIMARY KEY IDENTITY(1,1), "
					+ " employee_type_id INTEGER FOREIGN KEY REFERENCES Employee_Type(id), "
					+ " room_type_id INTEGER FOREIGN KEY REFERENCES Rooms(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active tinyint NOT NULL)";

			stmt.executeUpdate(createEmployeeTable);
			System.out.println("Employee Table Created Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// close createEmployeeTable Function

}// close CreateTables class
