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
//		System.out.println("18. Print Room information by user input                       |");
		
//		System.out.println("12. Insert data Into Employee table                            |");
//		System.out.println("13. Exit System                                                |");
//		System.out.println("_______________________________________________________________|");
	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		menue();
		System.out.println("Write the number of the option you want to choose:");
		do {

			int Menue = sc.nextInt();
			switch (Menue) {

			// Creating all of the table
			case 1:
				// object chaining for creating all of the tables
				CreateTables createAllTableObject = new CreateTables();
				// create Hotel Table
				createAllTableObject.createHotelTable();
				// create Room Type Table
				createAllTableObject.createRoomTypeTable();
				// create Rooms Table
				createAllTableObject.createRoomsTable();
				// create Guests Table
				createAllTableObject.createGuestsTable();
				// create Employees Type Table
				createAllTableObject.createEmployeeTypeTable();
				// create Employees Table
				createAllTableObject.createEmployeesTable();

				menue();
				break;

			// Insert 10,000 hotels
			case 2:
				InsertValues insertHotelsObject = new InsertValues();
				insertHotelsObject.insertIntoHotelTable(10000);

				menue();
				break;

			// Insert 1 hotel
			case 3:
				InsertValues insertHotelsObject1 = new InsertValues();
				insertHotelsObject1.insertIntoHotelTable(1);

				menue();
				break;

			// Delete Hotel Record By ID
			case 4:
				DeleteRecord DeleteRecordObject = new DeleteRecord();
				DeleteRecordObject.deleteHotelById();

				menue();
				break;

			// Print Hotel 10 Records Only
			case 5:
				PrintTable printTableObject = new PrintTable();
				printTableObject.readFromHotelTable(10);

				menue();
				break;

			// Print Hotel Records By User Input
			case 6:
				PrintTable PrintTableObject = new PrintTable();
				PrintTableObject.readFromTableByUser();

				menue();
				break;

			// Update Hotel record by ID
			case 7:
				UpdateRecord updateHotelByIDObject = new UpdateRecord();
				updateHotelByIDObject.updateHotelById();

				menue();
				break;

			// Get Hotel record by ID
			case 8:
				PrintTable PrintHotelByIDObject = new PrintTable();
				PrintHotelByIDObject.getHotelById();

				menue();
				break;

			// Make 'is_Active'=False by selecting the ID with user Input
			case 9:
				ActivationUpdate UpdateByIDObject = new ActivationUpdate();
				UpdateByIDObject.makeIsActiveFalseById();

				menue();
				break;

			// Make first 10 hotels 'is_Active' = False
			case 10:
				ActivationUpdate deactivateObject = new ActivationUpdate();
				deactivateObject.makeIsActiveFalseByIdTen();

				menue();
				break;

			// Make first 10 hotels 'is_Active' = True
			case 11:
				ActivationUpdate activateObject = new ActivationUpdate();
				activateObject.makeIsActiveTrueByIdTen();

				menue();
				break;

			// Insert Values into Room Type
			case 12:
				InsertValues insertValuesInRoomTypeObject = new InsertValues();
				insertValuesInRoomTypeObject.insertIntoRoomsTypeTable();

				menue();
				break;

			// Delete Room Type record by ID
			case 13:
				DeleteRecord deleteRoomTypeRecordObject = new DeleteRecord();
				deleteRoomTypeRecordObject.deleteRoomTypeById();

				menue();
				break;

			// Print Room Type information by user input
			case 14:
				PrintTable PrintRoomTypeByIDTableObject = new PrintTable();
				PrintRoomTypeByIDTableObject.printRoomTypeById();

				menue();
				break;

			// Make 'is_Active'=False by selecting the ID with user Input
			case 15:
				ActivationUpdate activationUpdateOnRoomType = new ActivationUpdate();
				activationUpdateOnRoomType.makeRoomTypeIsActiveFalseById();

				menue();
				break;

			// Insert data Into Rooms table
			case 16:
				InsertValues insertValuesIntoRoomsObject = new InsertValues();
				insertValuesIntoRoomsObject.insertIntoRoomsTable();

				menue();
				break;

			// Delete Room Type Record By ID 
			case 17:
				DeleteRecord deleteRecordByIdFromRoomsObject = new DeleteRecord();
				deleteRecordByIdFromRoomsObject.deleteRoomById();

				menue();
				break;
				
				// Print Room Table information By ID 
			case 18:
				PrintTable printRoomsTableByIDObject = new PrintTable();
				printRoomsTableByIDObject.printRoomsById();

				menue();
				break;
				
			case 19:
				InsertValues insertIntoGuestsObject = new InsertValues();
				insertIntoGuestsObject.insertIntoGuestsTable();

				menue();
				break;
				
			case 20:
				DeleteRecord deleteGuestRecordByID = new DeleteRecord();
				deleteGuestRecordByID.deleteGuestById();
				menue();
				break;
//
//			// Exit the System
////			case 13:
////				System.out.println("Exiting The System Bye See you Again :)!...");
////				System.exit(0);

			}

		} while (true);

	}
}