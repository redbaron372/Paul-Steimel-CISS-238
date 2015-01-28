package chapter3;
/**Paul Steimel
 * Chapter 3
 * Programming Challenge 1
 *
 */



//The Employee class represents an employee.
public class Employee {

	// Fields
	
	private String name;		// Employee's name.
	private int idNumber;	// Employee's ID Number.
	private String department;	// Department Name.
	private String position;	// Employee's position.
	

	
	/** 
	 * The getName method returns the Employee's
	 * name. 
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * The setName method accepts an argument
	 * for the Employee's name.
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The getIdNumber method returns the Employee's
	 * ID Number.
	 */
	
	public int getIdNumber() {
		return idNumber;
	}
	
	/**
	 * The setIdNumber method accepts an argument
	 * for the Employee's ID Number.
	 */
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	/**
	 * The getDepartment method returns the Employee's
	 * department name.
	 */
	
	public String getDepartment() {
		return department;
	}
	
	/**
	 * The setDepartment method accepts and argument
	 * for the Employee's department name.
	 */
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * The getPosition method returns the Employee's
	 * position title.
	 */
	
	public String getPosition() {
		return position;
	}
	
	/**
	 * The setPosition method accepts an argument
	 * for the Employee's position title.
	 */
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
