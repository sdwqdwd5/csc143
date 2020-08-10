package college;

public class Student extends Person {
	private Person person;
	private Rank rank;
	private Major major;
	private double gpa;
	
	public Student(String name, int age, Rank rank, Major major, double gpa) {
		super(name, age);
		this.rank = rank;
		this.major = major;
		this.gpa = gpa;
		
	}
	
	public Student(Person person, Rank rank, Major major, double gpa) {
		super(person);
		this.rank = rank;
		this.major = major;
		this.gpa = gpa;
	}
	
	public Student(Student other) {
		super(other.person);
		this.major = other.major;
		this.rank = other.rank;
		this.gpa = other.gpa;
	}
	
	public boolean equals(Object object) {
		if(object instanceof Employee) {
			Student other = (Student) object;
			return  true   == other.person.equals(person) &&
					gpa == other.gpa &&
					rank == other.rank &&
					major  == other.major;
		}
		return false;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Major getMajor() {
		return major;
	}
	
	public boolean isOnDeansList() {
		if (gpa >= 3.6) {
			return true;
		}return false;
	}
	
	public boolean isOnProbation() {
		if (gpa < 2.0 ) {
			return true;
		}return false;
	}
	
	public void printStatus() {
		System.out.println(" : Student");
		
	}
	public String toString() {
		String temp = isOnDeansList()? "YES": "NO";
		String temp2 = isOnProbation()? "YES" : "NO";

		
		return  
				super.toString() + "\n" +
				"Rank        : " + rank + "\n" +
				"Major       : " + major + "\n" +
				"GPA         : " + gpa + "\n" +
				"Deans List  : " + temp + "\n" +
				"On Probation: " + temp2 + "\n" ;
	}
}
