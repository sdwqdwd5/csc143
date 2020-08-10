package college;

public class Person {
	
/***********************************************
 * 	data fields
 * 	stores the information of Person.
 ***********************************************/
	
private int age;
private String name;

/***********************************************************
 * 	constructs and initializes the current information to the 
 *  specified Person.
 *  name refer to name
 *  age refer to age
 ***********************************************************/
	
public Person(String name, int age) {
	
	this.name = name;
	this.age = age;
	
}

/**********************************************************
 * 	constructs and initializes the current point to the 
 *  location specified by other Person passed.
 * 	@param other point object.
 **********************************************************/

public Person(Person other) {
	this.name = other.name;
	this.age = other.age;
}

/***********************************************************
 * 	compare the person's name first, if the name is the same
 *  then compare the age
 *  implementing comparable interface
 ***********************************************************/

public int compareTo(Person other) {
	String FF = name.split(" ")[0];
	String FL = name.split(" ")[1];
	String SF = other.name.split(" ")[0];
	String SL = other.name.split(" ")[1];
	if ( FL.compareTo(SL) != 0) {
		return FL.compareTo(SL);
	}else if(FF.compareTo(SF) != 0) {
		return FF.compareTo(SF);
	}else if( this.age != other.age) {
		if (this.age > other.age) {
			return 1;
		}else {
			return -1;
		}
	}else {
		return 0;
	}
}

/***************************************************************
 * 	compares the contents of the current object to the passed
 *  object. Returns true if they have the same information.
 * 	@return result of content evaluation.
 ***************************************************************/

public boolean equals(Object object) {
	if(object instanceof Person) {
		Person other = (Person) object;
		
		return name.equals(other.name) &&
			   age == other.age;
	}
		return false;
}

/***************************************************************
 * 	returns the age of the Person in int precision.
 * 	@return age information of Person object.
 ***************************************************************/

public int getAge() {
	return age;
}

/***************************************************************
 * 	returns the Name of the Person in String.
 * 	@return Name information of Person object.
 ***************************************************************/

public String getName() {
	return name;
}

public void printStatus() {
	System.out.println("Person");
}

/***************************************************************
 * 	returns string representation of a Person in comma separated
 * 	form.
 * 	@return Person's information.
 **************************************************************/

public String toFile() {
	return name + ", "+ age;
}
/***************************************************************
 * 	returns string representation of a Person.
 * 	@return Person's information.
 **************************************************************/
public String toString() {
	return "Name        : " + name + "\n" +
		   "Age         : " + age;
}

}
