package college;

import java.io.File;
import java.io.FileNotFoundException;

import utility.Filter;

public class SchoolClient {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Filter T1 = new Filter();
		
		String S_Alphabet =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "sortAlphabet.txt";
		String P_Employee =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "Students-01.txt";
		String S_Age =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "sortAge.txt";
		String filterOver25 =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterOver25.txt";
		String filterUnder25 =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterUnder25.txt";
		String filterFreshman =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterFreshman.txt";
		String filterSophemore =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterSophemore.txt";
		String filterIsOnDeansList =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterIsOnDeansList.txt";
		String filterIsOnProbation =  
				File.separator + "C:"      + File.separator + "Users" +
				File.separator + "sunny"   + File.separator + "Documents" + 
				File.separator + "CSC143"  +
				File.separator + "filterIsOnProbation.txt";
		
		
		
		T1.read(P_Employee);
		
		Student.Builder builder = new Student.Builder();
		Student s1 = builder.setName("Peter Chan")
							.setAge(20)
							.setRank(Rank.SOPH)
							.setMajor(Major.CSC)
							.setCourses(new Course(Title.CSC,4.0))
							.setCourses(new Course(Title.ASTR,4.0))
							.setCourses(new Course(Title.PHYS,4.0))
							.build();
		Student.Builder builderXi = new Student.Builder();
		Student s2 = builderXi.setName("Winnie Xi")
							.setAge(87)
							.setRank(Rank.SEN)
							.setMajor(Major.ENG)
							.setCourses(new Course(Title.CSC,1.0))
							.setCourses(new Course(Title.ASTR,3.0))
							.setCourses(new Course(Title.PHYS,2.0))
							.build();
//		System.out.println(Student.compareAge(s1, s2));
		System.out.println(s1);
//		System.out.println(s1.isOnDeansList());
		System.out.println(s2.isOnProbation());
//		System.out.println(s1.courses());
		T1.search("Michael Wang");
		
		T1.sortAlphabeticalOrder(S_Alphabet);
		T1.sortAge(S_Age);
		
		T1.filterOver25(filterOver25);
		T1.filterUnder25(filterUnder25);
		T1.filterFreshman(filterFreshman);
		T1.filterSophemore(filterSophemore);
		T1.filterIsOnDeansList(filterIsOnDeansList);
		T1.filterIsOnProbation(filterIsOnProbation);
	
	
	}
	
//	public static void print(Person person) {
//		System.out.print("Who am I ? "); person.printStatus();
//		System.out.print("Class       : " + person.getClass() + "\n" + person + "\n");
//	}
	}

