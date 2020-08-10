package recursion;

public class IterationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(2));
		System.out.println(fib(9));
		System.out.println(sum(10));
	}
	
	public static int fac(int n) {
		if (n > 0) {
			return n * fac(n-1);
		}else if (n == 0) {
			return 1;
		}throw new IllegalArgumentException();
	}
	public static int sum(int n) {
		if (n > 0) {
			int sum = n + sum(n-1);
			return sum;
		} else if (n==0) {
			return 0;
		}throw new IllegalArgumentException();
		
	}
	
	public static int fib(int n) {
		if (n > 1) {
			return fib(n-1) + fib(n-2);
		}else if (n==0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}throw new IllegalArgumentException();
	}
}
