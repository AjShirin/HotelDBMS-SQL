package HotelDBMS;

import java.util.Scanner;

public class Main {

	static void menue() {
		System.out.println("_______________________________________________________________");
		System.out.println("Welcome!! Please Select one of the following options :) :      |");
		System.out.println("1. Create All Tables                                           |");
		System.out.println("2. Insert 10,000 hotels                                        |");
		System.out.println("3. Insert 1 hotel                                              |");
		System.out.println("4. print 10 hotels                                             |");
		System.out.println("5. Make 'is_Active'=False  by selecting the ID with user Input |");
		System.out.println("6. Make first 10 hotels 'is_Active' = False                    |");
		System.out.println("7. Make first 10 hotels 'is_Active' = True                     |");
		System.out.println("8. Print hotel information by user input                       |");
		System.out.println("9. Delete Hotel record by ID                                   |");
		System.out.println("10. Get Hotel record by ID                                     |");
		System.out.println("11. Update Hotel record by ID                                  |");
		System.out.println("12. Exit System                                                |");
		System.out.println("_______________________________________________________________|");
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

				// object chaining for creating hotel table
				CreateHotelTable createHotelTableObject = new CreateHotelTable();
				createHotelTableObject.createHotelTable();

				// Object chaining for creating RoomType table
				CreateRoomTypeTable createCreateRoomTypeTableObject = new CreateRoomTypeTable();
				createCreateRoomTypeTableObject.createRoomTypeTable();

				// Object chaining for creating Rooms table
				CreateRoomTable CreateRoomTableObject = new CreateRoomTable();
				CreateRoomTableObject.createRoomsTable();

				// object chaining for creating guests table
				CreateGuestsTable CreateGuestsTableObject = new CreateGuestsTable();
				CreateGuestsTableObject.createGuestsTable();

				// object chaining for creating employee Type table
				CreateEmployeeTypeTable CreateEmployeeTypeTableObject = new CreateEmployeeTypeTable();
				CreateEmployeeTypeTableObject.createEmployeeTypeTable();

				// object chaining for creating employee table
				createEmployeesTable createEmployeesTableObject = new createEmployeesTable();
				createEmployeesTableObject.createEmployeesTable();

				menue();

				break;

			// Insert 10,000 hotels
			case 2:
				InsertHotels insertHotelsObject = new InsertHotels();
				insertHotelsObject.insertIntoTable(10000);

				menue();

				break;

			// Insert 1 hotel
			case 3:
				InsertHotels insertHotelsObject2 = new InsertHotels();
				insertHotelsObject2.insertIntoTable(1);

				menue();

				// Delete a record
//				DeleteRecord DeleteRecordObject = new DeleteRecord();
//				DeleteRecordObject.deleteById();

				break;

			// print hotel table
			case 4:
//				PrintTable PrintTableObject = new PrintTable();
//				PrintTableObject.printTable();
				PrintTable printTableObject = new PrintTable();
				printTableObject.readFromTable(10);

				menue();

				break;

			// Make 'is_Active'=False by selecting the ID with user Input
			case 5:
				ActivationUpdate UpdateByIDObject = new ActivationUpdate();
				UpdateByIDObject.makeIsActiveFalseById();

				menue();

				break;

			// Make first 10 hotels 'is_Active' = False
			case 6:
				ActivationUpdate deactivateObject = new ActivationUpdate();
				deactivateObject.makeIsActiveFalseByIdTen();

				menue();

				break;

			// Make first 10 hotels 'is_Active' = True
			case 7:
				ActivationUpdate activateObject = new ActivationUpdate();
				activateObject.makeIsActiveTrueByIdTen();

				menue();

				break;

			// Print hotel information by user input
			case 8:
				PrintTable printTableObject2 = new PrintTable();
				printTableObject2.readFromTableByUser();

				menue();

				break;

			// Delete Hotel record by ID
			case 9:
				DeleteRecord deleteHotelRecordObject = new DeleteRecord();
				deleteHotelRecordObject.deleteById();

				menue();

				break;

			// Get Hotel record by ID
			case 10:
				getID getByIdObject = new getID();
				getByIdObject.getById();

				menue();

				break;

			// Update Hotel record by ID
			case 11:

				RecordUpdate updateByIDObject = new RecordUpdate();
				updateByIDObject.updateById();

				menue();

				break;

			// Exit the System
			case 12:
				System.out.println("Exiting The System Bye See you Again :)!...");
				System.exit(0);

				break;
			}

		} while (true);

	}
}