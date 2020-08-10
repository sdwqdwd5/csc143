package college;

import java.text.DecimalFormat;

public class Employee extends Person{
	/***********************************************
	 * 	data fields
	 * 	stores the information of Employee
	 ***********************************************/

	private String office;
	private Person person;
	private double salary;
	private double years;

	/***********************************************************
	 * 	constructs and initializes the current information to the 
	 *  specified Employee.
	 *  name, age refer to person.
	 *  office refer to office.
	 *  salary refer to salary.
	 *  years  refer to years.
	 ***********************************************************/
		
	public Employee(String name, int age, String office, double salary, double years) {
		super(name, age);
		this.office = office;
		this.salary = salary;
		this.years  = years;
	}

	/***********************************************************
	 * 	constructs and initializes the current information to the 
	 *  specified Employee.
	 *  person refer to person.
	 *  office refer to office.
	 *  salary refer to salary.
	 *  years  refer to years.
	 ***********************************************************/

	public Employee(Person person, String office, double salary, double years) {
		super(person);
		this.office = office;
		this.salary = salary;
		this.years  = years;
	}

	/**********************************************************
	 * 	constructs and initializes the current point to the 
	 *  location specified by other Employee passed.
	 * 	@param other point object.
	 **********************************************************/

	public Employee(Employee other) {
		super(other.person);
		this.office = other.office;
		this.salary = other.salary;
		this.years  = other.years;
	}

	/***************************************************************
	 * 	compares the contents of the current object to the passed
	 *  object. Returns true if they have the same information.
	 * 	@return result of content evaluation.
	 ***************************************************************/

	public boolean equals(Object object) {
		if(object instanceof Employee) {
			Employee other = (Employee) object;
			return  true   == other.person.equals(person) &&
					//person.getName() == other.person.getName() &&
					//person.getAge() == other.person.getAge() &&
					office == other.office &&
					salary == other.salary &&
					years  == other.years;
		}
		return false;
	}

	/***************************************************************
	 * 	returns the office of the Employee in String.
	 * 	@return office information of Employee object.
	 ***************************************************************/

	public String getOffice() {
		return office;
	}

	/***************************************************************
	 * 	returns the person of the Employee in Person class.
	 * 	@return person information of Employee object.
	 ***************************************************************/

	public Person getPerson() {
		return person;
	}

	/***************************************************************
	 * 	returns the salary of the Employee in double precision.
	 * 	@return salary information of Employee object.
	 ***************************************************************/

	public double getSalary() {
		return salary;
	}

	/***************************************************************
	 * 	returns the years of the Employee in double precision.
	 * 	@return years information of Employee object.
	 ***************************************************************/

	public double getYears() {
		return years;
	}

	/***************************************************************
	 * 	returns the payments of the Employee in double precision.
	 * 	@return payments information of Employee object.
	 ***************************************************************/

	public double payments() {
		return salary/24.0;
	}
	
	public void printStatus() {
		System.out.println(" : Employee");
	}
	/***************************************************************
	 * 	returns string representation of a Employee.
	 *  use DecimalFormat to format the double precision to 2 decimal place.	
	 * 	@return Employee's information.
	 **************************************************************/

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.toString() + "\n" +
			   "Office      : " + office + "\n" +
			   "Annual      : " + df.format(salary) + "\n" +
			   "Years       : " + df.format(years) + "\n" +
			   "Monthly     : " + df.format(salary / 24.0) + "\n";
	}

}