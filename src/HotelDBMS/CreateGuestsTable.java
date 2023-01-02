package HotelDBMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateGuestsTable {
	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDBMS;encrypt=true;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASS = "root";

	static void createGuestsTable() throws IOException {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String createRoomsTable = "CREATE TABLE Guests " + "(id INTEGER PRIMARY KEY, "
					+ " guest_name VARCHAR(50) NOT NULL, " + " guest_phone VARCHAR(50) NOT NULL, "
					+ " guest_accompanying_members INTEGER NOT NULL, " + " guest_payment_amount INTEGER NOT NULL,"
					+ " room_id INTEGER FOREIGN KEY REFERENCES Rooms(id), "
					+ " hotel_id INTEGER FOREIGN KEY REFERENCES Hotels(id), " + " created_date date NOT NULL, "
					+ " updated_date date, " + " is_Active bit NOT NULL)";

			stmt.executeUpdate(createRoomsTable);
			System.out.println("Created table Successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
