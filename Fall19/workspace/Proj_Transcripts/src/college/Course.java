package college;
import utility.Comparable;
public class Course implements Comparable<Course>{
	private Title  course;
	private double gpa;
	
	public Course(){
		this.course = Title.CSC;
		this.gpa 	= 2.0;
	}
	
	public Course(Course other) {
		this.course = other.course;
		this.gpa 	= other.gpa;
	}
	
	public Course(Title course, double gpa) {
		this.course = course;
		this.gpa 	= gpa;
	}
	
	/* used the toFile() method which return String to compare course
	 * implemented compareTo method in String library instead of compare 
	 * method in enum library 
	 */
	public int compareTo(Course other) {
		return this.course.toFile().compareTo(other.course().toFile());
	}
	
	public Title course() {
		return course;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Course) {
			Course other = (Course) object;
			return course.equals(other.course) &&
				   Double.compare(gpa, other.gpa) == 0;
		}
		return false;
	}
	public double gpa() {
		return gpa;
	}
	
	public void setCourse(Title course) {
		this.course = course;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String toFile() {
		return ", " + course.toFile() + "=" + gpa;
	}
	
	public String toString() {
		return "Course      : " + course  + "\t, " +
			   "CourseGPA: " + gpa;
			
	}
}
