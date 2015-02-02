package chapter7;

import java.util.Scanner;

/**Paul Steimel
 * Chapter 7
 * Programming Challenge 2
 *
 */

public class Payroll {
	
	//Constant for number of employees
	public final int NUM_EMPLOYEES = 7;
	
	//Array of employee ID Numbers
	private int[] employeeId = { 
			5658845, 4520125, 7895122, 8777541,
			8451277, 1302850, 7580489
	};
	
	//Array for hours worked
	private int[] hours = new int[NUM_EMPLOYEES];
	
	//Array for pay rates
	private double[] payRate = new double[NUM_EMPLOYEES];
	
	//Array for wages earned
	private double[] wages = new double[NUM_EMPLOYEES];

	//Constructor for payroll class
	public Payroll() {
		
	}

	//method to get values from user
	public void getValues()
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int index = 0; index < NUM_EMPLOYEES; index++)
		{
			System.out.print("Enter the hours worked by employee number " + 
			employeeId[index] + ":");
			hours[index] = keyboard.nextInt();
			
			if (hours[index] < 0){
				System.out.print("ERROR: Enter 0 or greater for hours: ");
				hours[index] = keyboard.nextInt();
			}
			
			System.out.print("Enter the hourly pay rate for employee number " +
			employeeId[index] + ":");
			payRate[index] = keyboard.nextDouble();
			
			if (payRate[index] < 6){
				System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
				payRate[index] = keyboard.nextInt();
				
			}
			
			wages[index] = hours[index] * payRate[index];
			
			
		}
	}
	
	//Method to display the wages of employees
	public void getWages()
	{
		System.out.println("");
		System.out.println("PAYROLL DATA");
		System.out.println("============");
		
		for (int index = 0; index < NUM_EMPLOYEES; index++)
		{
			System.out.println("Employee ID: " + employeeId[index]);
			System.out.println("Gross pay: $" + wages[index]);
			System.out.println("");
			
			
		}
	}
	
	
	//Method to return the gross pay.
	public double getGrossPay(int number){
		return wages[employeeId[number]];
	}




}
