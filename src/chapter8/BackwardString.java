package chapter8;

import java.util.Scanner;

/**Paul Steimel
 * Chapter 8
 * Programming Challenge 1
 *
 */

public class BackwardString {

	public static void main(String[] args) {
		
		String sforward = ""; //Holds the user entered string
		
		Scanner input = new Scanner(System.in); //Holds the input
		
		System.out.print("Enter Something: "); //Collect user input
		sforward = input.nextLine();
		
		//Output the user string one character at a time in reverse
		for(int index = sforward.length()-1; index > (-1); index--){
			System.out.print(sforward.charAt(index));
		}
	}

}
