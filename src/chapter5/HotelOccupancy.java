package chapter5;

import java.util.Scanner;

/**Paul Steimel
 * Chapter 5
 * Programming Challenge 5
 *
 */

public class HotelOccupancy {

	public static void main(String[] args) {

		double roomsOccupied = 0;	//Rooms occupied accumulator
		double totalRooms = 0;		//Total rooms accumulator
		int floorRooms = 0;			//Rooms on a floor
		int floorOccupiedRooms = 0;	//Occupied rooms on a floor
		int floors;					//Number of floors
		double occupancyRate = 0;	//Occupancy rate
		
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the number of floors
		System.out.print("Enter the number of floors: ");
		floors = keyboard.nextInt();
		
		//Validation of input
		while (floors < 1)
		{
			System.out.print("Invalid. Enter 1 or greater: ");
			floors = keyboard.nextInt();
		}
		
		
		System.out.println("Enter the number of rooms on each floor " +
		"and the number of rooms that are occupied on each floor.");
		
		for (int f = 1; f <= floors; f++)
		{
			//Get the number of rooms for a floor
			System.out.print("Floor " + f + " total rooms:");
			floorRooms = keyboard.nextInt();
			
			//Validate the input
			while (floorRooms < 10)
			{
				System.out.print("Invalid. Enter 10 or greater: ");
				floorRooms = keyboard.nextInt();
			}
			
			//Accumulate total rooms
			totalRooms += floorRooms;
			
			//Get the number of occupied rooms on a floor
			System.out.print("Floor " + f + " occupied rooms:");
			floorOccupiedRooms = keyboard.nextInt();
			
			//Validate the input is not a negative number
			while (floorOccupiedRooms < 0)
			{
				System.out.print("Invalid. Enter 0 or greater: ");
				floorOccupiedRooms = keyboard.nextInt();
			}
			
			//Validate the input is not greater than rooms on the floor
			while (floorOccupiedRooms > floorRooms)
			{
				System.out.print("Invalid. Enter " + floorRooms +
						" or less:");
				floorOccupiedRooms = keyboard.nextInt();
			}
			
			//Accumulate occupied rooms
			roomsOccupied += floorOccupiedRooms;
			
		}
		
		//Calculate occupancy rate
		occupancyRate = (roomsOccupied / totalRooms);
		
		//Display results.
		System.out.println("\nNumber of rooms: " + totalRooms);
		System.out.println("Occupied rooms: " + roomsOccupied);
		System.out.println("Vacant rooms: " + (totalRooms - roomsOccupied));
		System.out.println("Occupancy rate: " + occupancyRate);

	}

}
