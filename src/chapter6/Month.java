package chapter6;

/**Paul Steimel
 * Chapter 6
 * Programming Challenge 5
 *
 */


public class Month {
	
	private int monthNumber; //field to hold the month number
	
	
	/**
	 * Constructor with no argument that sets monthNumber field
	 * to one
	 */
	public Month() {
		monthNumber = 1;
		
	}
	
	/**
	 * Constructor that accepts an argument and passes it to
	 * the monthNumber field.
	 */
	
	public Month(int m) {
		monthNumber = m;
		if(monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
	}
	
	/**
	 * Constructor that accepts the name of a month as an
	 * argument.
	 */
	
	public Month(String m) {
		if(m.equalsIgnoreCase("january")) {
			monthNumber = 1;
		}
		else if(m.equalsIgnoreCase("february")) {
			monthNumber = 2;
		}
		else if(m.equalsIgnoreCase("march")) {
			monthNumber = 3;
		}
		else if(m.equalsIgnoreCase("april")) {
			monthNumber = 4;
		}
		else if(m.equalsIgnoreCase("may")) {
			monthNumber = 5;
		}
		else if(m.equalsIgnoreCase("june")) {
			monthNumber = 6;
		}
		else if(m.equalsIgnoreCase("july")) {
			monthNumber = 7;
		}
		else if(m.equalsIgnoreCase("august")) {
			monthNumber = 8;
		}
		else if(m.equalsIgnoreCase("september")) {
			monthNumber = 9;
		}
		else if(m.equalsIgnoreCase("october")) {
			monthNumber = 10;
		}
		else if(m.equalsIgnoreCase("november")) {
			monthNumber = 11;
		}
		else if(m.equalsIgnoreCase("december")) {
			monthNumber = 12;
		}
		else {
			monthNumber = 1;
		}
		

				
	}

	/**
	 * Set method for monthNumber
	 */
	
	
	public void setMonthNumber(int m) {
		this.monthNumber = m;
		if(monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = 1;
		}
	}
	
	/**
	 * Getter to return monthNumber
	 */
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	/**
	 * Getter to return the name of the month
	 */
	
	public String getMonthName() {
		String name;
		switch (monthNumber) {
		case 1:
			name = "january";
			break;
		case 2:
			name = "february";
			break;
		case 3:
			name = "march";
			break;
		case 4:
			name = "april";
			break;
		case 5:
			name = "may";
			break;
		case 6:
			name = "june";
			break;
		case 7:
			name = "july";
			break;
		case 8:
			name = "august";
			break;
		case 9:
			name = "september";
			break;
		case 10:
			name = "october";
			break;
		case 11:
			name = "november";
			break;
		case 12:
			name = "december";
			break;
		default:
			name = "Unkown";
		}
		return name;
	}
	
	
	public String toString() {
		return getMonthName();
	}
	
	
	/**
	 *Method to test equality of months 
	 */
	
	public boolean equals(Month month2) {
		boolean status;
		
		if (month2.getMonthNumber() == monthNumber)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Method to test if one month is greater than another
	 */
	
	
	public boolean greaterThan(Month month2) {
		boolean status;
		
		if (monthNumber > month2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}
	
	
	/**
	 *Method to test if one month is less than another
	 */
	
	public boolean lessThan(Month month2) {
		boolean status;
		
		if (monthNumber < month2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}
	
	
	
	
	
}
