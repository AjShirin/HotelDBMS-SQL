package HotelDBMS;

import java.util.Scanner;

public class Main  {

	static void menue() {
		System.out.println("_______________________________________________________________");
		System.out.println("Welcome!! Please Select one of the following options :) :      |");
		System.out.println("1. Create All Tables                                           |");
		System.out.println("2. Insert 10,000 hotels                                        |");
		System.out.println("3. Insert 1 hotel                                              |");
		System.out.println("4. print 10 hotels                                             |");
		System.out.println("5. Make first 10 hotels 'is_Active' = false                    |");
		System.out.println("6. Print hotel information by user input                       |");
		System.out.println("7. Exit System                                                 |");
		System.out.println("_______________________________________________________________|");
	}

	public static void main(String[] args) throws Throwable {

		Scanner sc = new Scanner(System.in);

		menue();
		System.out.println("Write the number of the option you want to choose:");
		do {

			int Menue = sc.nextInt();
			switch (Menue) {
			case 1:
				
				//object chaining for creating hotel table 
				CreateHotelTable createHotelTableObject = new CreateHotelTable();
				createHotelTableObject.createHotelTable();
				
				//Object chaining for creating RoomType table
				CreateRoomTypeTable createCreateRoomTypeTableObject = new CreateRoomTypeTable();
				createCreateRoomTypeTableObject.createRoomTypeTable();
				
				// Object chaining for creating Rooms table
				CreateRoomTable CreateRoomTableObject = new CreateRoomTable();
				CreateRoomTableObject.createRoomsTable();
				
				//object chaining for creating guests table
				CreateGuestsTable CreateGuestsTableObject = new CreateGuestsTable();
				CreateGuestsTableObject.createGuestsTable();
				
				//object chaining for creating employee Type table
				CreateEmployeeTypeTable CreateEmployeeTypeTableObject = new CreateEmployeeTypeTable();
				CreateEmployeeTypeTableObject.createEmployeeTypeTable();
				
				//object chaining for creating employee table
				createEmployeesTable createEmployeesTableObject = new createEmployeesTable();
				createEmployeesTableObject.createEmployeesTable();

				menue();
				
				break;

			case 2:
				InsertHotels InsertHotelsObject = new InsertHotels();
				InsertHotelsObject.insertIntoTable();
				
				menue();
				
				break;

			case 3:
				// Delete a record
				DeleteRecord DeleteRecordObject = new DeleteRecord();
				DeleteRecordObject.deleteById();
				menue();
				break;

			case 4:
				

				break;
				
			case 5:
				UpdateByID UpdateByIDObject = new UpdateByID();
				UpdateByIDObject.makeIsActiveFalseById();
				menue();

			case 6:
				
				break;


			case 7:
				System.out.println("Exiting The System Bye See you Again :)!...");
				System.exit(0);

				break;
			}

		} while (true);

	}
}