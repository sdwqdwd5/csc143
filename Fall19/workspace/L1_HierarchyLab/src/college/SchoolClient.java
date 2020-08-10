package college;

public class SchoolClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student peter = new Student("Peter", 20, Rank.SOPHOMORE, Major.COMPUTER_SCIENCE, 3.98);
		print(peter);
		
		Employee david = new Employee("david", 30, "STEM220", 22000, 20);
		print(david);
	
	}
	
	public static void print(Person person) {
		System.out.print("Who am I ? "); person.printStatus();
		System.out.print("Class       : " + person.getClass() + "\n" + person + "\n");
	}
	}

