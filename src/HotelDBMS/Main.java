package HotelDBMS;

import java.util.Scanner;

public class Main {

	static void menue() {
		System.out.println("_______________________________________________________________");
		System.out.println("Welcome!! Please Select one of the following options :) :      |");
		System.out.println("1. Create All Tables                                           |");
		System.out.println("2. Insert 10,000 hotels                                        |");
		System.out.println("3. Insert 1 hotel                                              |");
		System.out.println("4. Delete Hotel Record By ID                                   |");
		System.out.println("5. Print 10 hotels                                             |");
		System.out.println("6. Print hotel information by user input                       |");
		System.out.println("7. Update Hotel record by ID                                   |");
		System.out.println("8. Get Hotel record by ID                                      |");
		System.out.println("9. Make 'is_Active'=False by selecting the ID with user Input  |");
		System.out.println("10. Make first 10 hotels 'is_Active' = False                   |");
		System.out.println("11. Make first 10 hotels 'is_Active' = True                    |");
		System.out.println("********Room Type********                                      |");
		System.out.println("12. Insert Records in  Room Type                               |");
		System.out.println("13. Delete Room Type Record By ID                              |");
		System.out.println("14. Print Room Type information by user input                  |");
		System.out.println("15. Make 'is_Active'=False by selecting the ID with user Input |");
		System.out.println("********Rooms********                                          |");
		System.out.println("16. Insert Records in  Rooms  Table                            |");
		System.out.println("17. Delete Room Type Record By ID                              |");
		System.out.println("18. Print Room information by user input                       |");
		System.out.println("********Guests********                                         |");
		System.out.println("19. Insert Records in Guests Table                             |");
		System.out.println("20. Delete Records in Guests Table                             |");
		System.out.println("21. Print Guest information by user input                      |");
		System.out.println("********Employee Type********                                  |");
		System.out.println("22. Insert Records in Employee Type Table                      |");
		System.out.println("23. Delete Records in Employee Type Table                      |");
		System.out.println("24. Print Employee Type information by user input              |");
		System.out.println("********Employees********                                      |");
		System.out.println("25. Insert data Into Employee Table                            |");
		System.out.println("26. Delete Records in Employee Table                           |");
		System.out.println("27. Print Employee Type information by user input              |");
		System.out.println("********New Task********                                       |");
		System.out.println("28. Insert 10 hotels                                           |");
		System.out.println("29. Guest Name End With E                                      |");
		System.out.println("30. Rooms where guests are paying more than 1000               |");
		// System.out.println("28. Exit System |");
		System.out.println("_______________________________________________________________|");
	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		menue();
		System.out.println("Write the number of the option you want to choose:");
		do {

			int Menue = sc.nextInt();
			switch (Menue) {

			// Since The function is Static no need to create new object

			// Creating all of the table
			case 1:
				// create Hotel Table
				CreateTables.createHotelTable();
				// create Room Type Table
				CreateTables.createRoomTypeTable();
				// create Rooms Table
				CreateTables.createRoomsTable();
				// create Guests Table
				CreateTables.createGuestsTable();
				// create Employees Type Table
				CreateTables.createEmployeeTypeTable();
				// create Employees Table
				CreateTables.createEmployeesTable();

				menue();
				break;

			// Insert 10,000 hotels
			case 2:
				InsertValues.insertIntoHotelTable(10000);

				menue();
				break;

			// Insert 1 hotel
			case 3:
				InsertValues.insertIntoHotelTable(1);

				menue();
				break;

			// Delete Hotel Record By ID
			case 4:
				DeleteRecord.deleteHotelById();

				menue();
				break;

			// Print Hotel 10 Records Only
			case 5:
				PrintTable.readFromHotelTable(10);

				menue();
				break;

			// Print Hotel Records By User Input
			case 6:
				PrintTable.readFromTableByUser();

				menue();
				break;

			// Update Hotel record by ID
			case 7:
				UpdateRecord.updateHotelById();

				menue();
				break;

			// Get Hotel record by ID
			case 8:
				PrintTable.getHotelById();

				menue();
				break;

			// Make 'is_Active'=False by selecting the ID with user Input
			case 9:
				ActivationUpdate.makeIsActiveFalseById();

				menue();
				break;

			// Make first 10 hotels 'is_Active' = False
			case 10:
				ActivationUpdate.makeIsActiveFalseByIdTen();

				menue();
				break;

			// Make first 10 hotels 'is_Active' = True
			case 11:
				ActivationUpdate.makeIsActiveTrueByIdTen();

				menue();
				break;

			// Insert Values into Room Type
			case 12:
				InsertValues.insertIntoRoomsTypeTable();

				menue();
				break;

			// Delete Room Type record by ID
			case 13:
				DeleteRecord.deleteRoomTypeById();

				menue();
				break;

			// Print Room Type information by user input
			case 14:
				PrintTable.printRoomTypeById();

				menue();
				break;

			// Make 'is_Active'=False by selecting the ID with user Input
			case 15:
				ActivationUpdate.makeRoomTypeIsActiveFalseById();

				menue();
				break;

			// Insert data Into Rooms table
			case 16:
				InsertValues.insertIntoRoomsTable();

				menue();
				break;

			// Delete Room Type Record By ID
			case 17:
				DeleteRecord.deleteRoomById();

				menue();
				break;

			// Print Room Table information By ID
			case 18:
				PrintTable.printRoomsById();

				menue();
				break;

			case 19:
				InsertValues.insertIntoGuestsTable();

				menue();
				break;

			// Delete Guest Table Record By ID
			case 20:
				DeleteRecord.deleteGuestById();
				menue();
				break;

			// Print Guest Table Record By ID
			case 21:
				PrintTable.printGuestById();
				menue();
				break;

			// Insert Records in Employee Type Table
			case 22:
				InsertValues.insertIntoEmployeeTypeTable();
				menue();
				break;

			// Delete Records in Employee Type Table By ID
			case 23:
				DeleteRecord.deleteEmployeeTypeById();

				menue();
				break;

			// Print Records from Employee Type Table By ID
			case 24:
				PrintTable.printEmployeeTypeById();

				menue();
				break;

			// Insert data Into Employee table
			case 25:
				InsertValues.insertIntoEmployeeTable();

				menue();
				break;

			// Delete Records in Employees Table By ID
			case 26:
				DeleteRecord.deleteEmployeeById();

				menue();
				break;

			// Print Records from Employees Table By ID
			case 27:
				PrintTable.printEmployeesById();

				menue();
				break;
				
			// Insert 10 hotels
			case 28:
				InsertValues.insertIntoHotelTable(10);

				menue();
				break;
			
			//Guest Name End With E
			case 29:
				HotelManagement.guestEndWith_E();

				menue();
				break;
				
			case 30:
				HotelManagement.guestPayingMoreThan100();

				menue();
				break;


//			// Exit the System
//			case 28:
//				System.out.println("Exiting The System Bye See you Again :)!...");
//				System.exit(0);

			}

		} while (true);

	}
}