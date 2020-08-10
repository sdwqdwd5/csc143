package filer;

public class Student {
	
	private String firstName;
	private String lastName;
	private double score;
	
	public Student(String firstName, String lastName, double score) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.score     = score;
	}
	
	public double getScore() {
		return score;
	}
	
	public String toFile( ) {
		return String.format("%4s %4s %.2f", firstName, lastName, score);
	}
	
	public String toString( ) {
		return String.format("%4s %4s %.2f", firstName, lastName, score);
	}
}
