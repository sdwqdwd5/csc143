package filer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileClient {

	public static void read() throws IOException{
		
		// set path name : YOU MUST CHANGE FOR YOUR COMPUTER
		String pathname1 =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143" +
				File.separator + "Scores.txt";
				
		File    file1 = new File(pathname1);
		Scanner input = new Scanner(file1);
		
		String firstName = "";
		String lastName  = "";
		double score	 = 0;
		
		// (1) read in the entries, print to console and place in an array.
		while(input.hasNext()) {
			
			// (2) enter code to read a students name and score
			
			// (3) write name and score to console
			System.out.println(firstName + " " + lastName + " " + score);
			
			// (4) Fill in other code that may be missing.
			
			// (5) print out the first names of the students to another file.
			//     call it First.txt (place it in the same location as scores).
			
		}
		
		// (6) display how many students are in the class.
		
		// (7) compute the average score of the student in the file and
		//     display it to the console.
		
		//close Scanner or other I/O
		input.close();
		
	}
	
	public static void write() throws IOException{
		
		// set path name : YOU MUST CHANGE FOR YOUR COMPUTER
		String pathname =  
				File.separator + "C:"      + File.separator + "Users" +
						File.separator + "sunny"   + File.separator + "Documents" + 
						File.separator + "CSC143" +
						File.separator + "Scores.txt";
				
		//create a file object
		File file = new File(pathname);	
		
		//check if file exists
		if (file.exists()) {
			System.out.println("File exists");
		}
		
		//create a file at the location indicated
		PrintWriter output = new PrintWriter(file);
		
		//write formatted output to file
		output.print("Jensen Jones\t");
		output.println(90);
		output.print("Juniper Riggs\t");
		output.println(88);
		output.print("Milton Badgely\t");
		output.println(72);
		
		//close the file
		output.close();

	}
	
	public static void main(String[] args) throws IOException{
		write();
		//read();
	}

}
