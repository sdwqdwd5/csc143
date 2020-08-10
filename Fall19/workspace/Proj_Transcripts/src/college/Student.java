package college;

import java.text.DecimalFormat;

import lists.ArrayList;
import utility.List;
import utility.Comparable;

public class Student implements Comparable<Student>{
	private final String 	   name;
	private final int          age;
	private final Rank         rank;
	private final Major        major;
	private final List<Course> courses;
	
	public Student(Builder builder) {
		this.name    = builder.name;
		this.age     = builder.age;
		this.rank    = builder.rank;
		this.major   = builder.major;
		this.courses = builder.courses;
	}
	
	public Student(Student other) {
		this.name    = other.name;
		this.age     = other.age;
		this.major   = other.major;
		this.rank    = other.rank;
		this.courses = other.courses;
	}
	
	public int age() {
		return age;
	}
	
	public static int compareAge(Student s1, Student s2) {
		if (s1.age != s2.age) {
			return Integer.compare(s1.age, s2.age);
		}else if(! s1.name.equals(s2.name)) {
			if (! s1.lastName().equals(s2.lastName())) {
				return s1.lastName().compareTo(s2.lastName());
			}
				return s1.firstName().compareTo(s2.firstName());
		}
				return compareGpa(s1,s2);		
	}
	
	public static int compareFirstName(Student s1, Student s2) {
		if (! s1.firstName().equals(s2.firstName())) {
			return s1.firstName().compareTo(s2.firstName());
		}
			return s1.lastName().compareTo(s2.lastName());
	}
	
	public static int compareGpa(Student s1, Student s2) {
		 return Double.compare(s1.gpa(), s2.gpa());
	}
	
	public int compareTo(Student other) {
		if (! this.name.equals(other.name)) {
			if (! lastName().equals(other.lastName())) {
				return lastName().compareTo(other.lastName());
			}	
				return firstName().compareTo(other.firstName());
		}else if (Double.compare(gpa(), other.gpa()) != 0) {
				return compareGpa(this,other);
		}
				return compareAge(this,other);
	}
	
	public List<Course> courseList(){
		return courses;
	}
	
	public String courses() {
		String course = "";
		for (int i = 0; i < courses.size(); i++){
			course = course + courses.get(i) + "\n";
		}
		return course;
	}
	
	public boolean equals(Object object) {
		if(object instanceof Student) {
			Student other = (Student) object;
			return  compareTo(other) == 0      &&
					rank.equals(other.rank)    &&
					major.equals(other.major)  &&
					courses().equals(other.courses());
					/*********************************************************
					 *used the courses() method which return String type
					 *instead of the Arraylist courses to compare both courses
					 *because the Arraylist do not have the equals method.
					 ********************************************************/
		}
		return false;
	}
	
	public String firstName() {
		return this.name.split(" ")[0];
	}

	public double gpa() {
		double overall = 0;
		for (int i = 0; i < courses.size(); i++) {
			overall += courses.get(i).gpa();
		}
		return overall/courses.size();
	}
	
	
	public boolean isOnDeansList() {
		if (gpa() >= 3.7) {
			return true;
		}
			return false;
	}
	
	public boolean isOnProbation() {
		if (gpa() < 2.0 ) {
			return true;
		}
			return false;
	}
	
	public String lastName() {
		return this.name.split(" ")[1];
	}
	
	public Major major() {
		return major;
	}
	
	public String name() {
		return name;
	}
	
	public Rank rank() {
		return rank;
	}
	
	public String toFile() {
		String allCourse = "";
		for (int i = 0; i < courses.size();i++) {
			allCourse = allCourse + courses.get(i).toFile();
		}
		return name +", " + age + ", " + rank.toFile() + ", " + major.toFile()  + allCourse; 
	}
	
	public String toString() {
		String temp      = isOnDeansList()? "YES" : "NO";
		String temp2     = isOnProbation()? "YES" : "NO";
		DecimalFormat df = new DecimalFormat("0.00");
		return  
				"Name        : " + name  			+ "\n" +
				"Age         : " + age  			+ "\n" +
				"Rank        : " + rank  			+ "\n" +
				"Major       : " + major 			+ "\n" +
				"Overall GPA : " + df.format(gpa()) + "\n" +
				 courses() 							+
				"Deans List  : " + temp  			+ "\n" +
				"On Probation: " + temp2 			+ "\n" ;
	}
	
	public static class Builder{
		private int age     		 = 0;
		private Major major          = Major.CSC;
		private String name			 = "";
		private Rank rank			 = Rank.FRESH;
		private List<Course> courses = new ArrayList<>();
		
		public Builder() {
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setMajor(Major major) {
			this.major = major;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setRank(Rank rank) {
			this.rank = rank;
			return this;
		}
		
		public Builder setCourses(Course course) {
			this.courses.add(course);
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
}
