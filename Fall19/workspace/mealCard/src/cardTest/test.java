package cardTest;
import cardInfo.student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student p1 = new student("peter");
		System.out.println(p1.getBalance());
		p1.purchaseItem("burger");
		p1.purchaseItem("burger");
		p1.purchaseItem("burger");
		p1.purchaseItem("burger");
		p1.addBalance(200);
		System.out.println(p1.getBalance());
		System.out.println(p1);
		

		
	}

}
