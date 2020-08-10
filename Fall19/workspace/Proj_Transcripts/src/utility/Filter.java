package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import lists.ArrayList;
import java.util.Scanner;

import college.Course;
import college.Major;
import college.Rank;
import college.Student;
import college.Title;

public class Filter {
	
	/***********************************************
	 * 	data fields
	 * 	stores the information of data as an 
	 * 	Array List
	 ***********************************************/
	
	private ArrayList<Student> data;
	
	/***********************************************************
	 * 	default constructor that return an empty array 
	 * 	list objects for data
	 ***********************************************************/

	public Filter() {
		data = new ArrayList<Student>();
	}

	public void filterFreshman(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).rank().equals(Rank.FRESH)) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}
	
	public void filterIsOnDeansList(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).isOnDeansList()) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}
	
	public void filterIsOnProbation(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).isOnProbation()) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}
	
	public void filterOver25(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).age()>25) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}
	
	public void filterSophemore(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).rank().equals(Rank.SOPH)) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}

	public void filterUnder25(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).age()<25) {
					writer.println(data.get(i));
				}
			}
		}
		writer.close();
	}
	
	public Course makeCourse(String str) {
		String[] info     = str.split("=");
		String[] course	  = info[0].split(" ");
		String coursename = course[0];
		double gpa 		  = Double.parseDouble(info[1]);
		return new Course(Title.valueOf(coursename), gpa);
	}
	
	/***************************************************************
	 * To parse each line of a file properly
	 * returns an object that is compatible with an Student object
	 * use the split method of the String class
	 ***************************************************************/
	
	public Student parse(String line) throws IllegalArgumentException{
		String[] info = line.split(", ");
		Student.Builder builder = new Student.Builder();
		Student s1 = builder.setName(info[0])
							.setAge(Integer.parseInt(info[1]))
							.setRank(Rank.valueOf(info[2]))
							.setMajor(Major.valueOf(info[3]))
							.setCourses(makeCourse(info[4]))
							.setCourses(makeCourse(info[5]))
							.setCourses(makeCourse(info[6]))
							.build();
		// sort the courses before return
		Batch.quickSort(s1.courseList());
		return s1;
	}

	/***************************************************************
	 * To read each line of a file properly
	 * parse the line first and then stores data as an array list
	 * use scanner class and array list class
	 ***************************************************************/
	
	
	public void read(String Location) throws FileNotFoundException{
		
		File    R_Student = new File(Location);
		Scanner input = new Scanner(R_Student);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (! data.contains(parse(line))) {
				data.add(parse(line));
			}
		}
		input.close();
	}
	
	/***************************************************************
	 * To search for the Student names and returns Student's 
	 * information to the console screen
	 * use the loop to check every index of the array list
	 ***************************************************************/
	
	public void search(String name) {
		int index = Batch.indexOf(data, name);
		if(index != -1) {
			System.out.println(data.get(index));
		}else {
			System.out.println("Cannot find the student " + name);
		}
	}
	
	public void search(Student student) {
		int index = Batch.binarySearch(data, student);
		if (index != -1) {
			System.out.println(data.get(index));
		}else {
			System.out.println("Cannot find the student " + student.name());
		}
	}
	/***************************************************************
	 * filters the data for students in alphabetical order
	 * by last name then first name and writes it to the indicates
	 * file location
	 * use the quickSort algorithm to sort
	 ***************************************************************/
	
	public void sortAlphabeticalOrder(String location) throws FileNotFoundException{
		Batch.quickSort(data);
		write(location);
	}
	
	/***************************************************************
	 * filters the data for students in the order of age
	 * and writes it to the indicates file location
	 * use the bubble sort algorithm to sort
	 * compare the age first, if age is the same, then use
	 * natural ordering
	 ***************************************************************/
	
	public void sortAge(String location) throws FileNotFoundException{
		Batch.selectionSort(data, Student::compareAge);
		write(location);
	}

	/***************************************************************
	 * writes the contents of a database element to a file
	 ***************************************************************/
	
	public void write(String location) throws FileNotFoundException{
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size();i++) {
				writer.println(data.get(i));
			}
		}
		writer.close();
	}
	
	/***************************************************************
	 * writes the contents of a database element to a file in a 
	 * comma separated form
	 ***************************************************************/
	
	public void writeCS(String location) throws FileNotFoundException{
		File 	write = new File(location);
		PrintStream writer = new PrintStream(write);
		if (write.exists()) {
			for (int i = 0; i < data.size();i++) {
				writer.println(data.get(i).toFile());
			}
		writer.close();
		}	
	}
}

