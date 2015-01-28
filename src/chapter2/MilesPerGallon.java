package chapter2;



/* Paul Steimel
 * Chapter 2
 * Programming Challenge 9
 */

import java.util.Scanner;
//Import statement to use Scanner

public class MilesPerGallon {

	public static void main(String[] args) {
		
		double miles;			//variable for miles
		double gallons;			//variable for gallons
		double milesPerGallon;	//variable for miles per gallon

		Scanner keyboard = new Scanner(System.in);
		// creating an input method
		
		
		System.out.println("Enter the miles driven:");
		miles = keyboard.nextDouble();
		//get miles driven from user
		
		
		System.out.println("Enter the gallons of fuel used:");
		gallons = keyboard.nextDouble();
		//get gallons used from user
		
		
		milesPerGallon = miles / gallons;
		// calculate miles per gallon
		
		System.out.println("The miles-per-gallon is " + milesPerGallon);
		// display miles per gallon
		
	}

}
