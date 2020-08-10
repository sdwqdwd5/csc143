package coordinates;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(4,6);
		Point p2 = new Point(p1);
		System.out.println(p2);
		p1.setLocation(3,5);
		System.out.println(p1);
		System.out.println(p2);
	
	}

}
