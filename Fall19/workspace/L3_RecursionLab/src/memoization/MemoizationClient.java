package memoization;

/***************************************************************************
 * <p> This program demonstrates the technique of recursion and includes 
 *     recursive methods that are defined for a variety of mathematical
 *     functions. 
 ***************************************************************************/
public class MemoizationClient {
	private static int[] arr;
	/***********************************************************
	 * returns the result of the Fibonacci sequence of numbers.
	 * @param n the integer n
	 * @throws IllegalArgumentException for negative numbers.
	 * *********************************************************/
	public static void setArray(int n) {
		arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
	}
	public static int fib(int n) {
		
		
		if(n < 0) {
			throw new IllegalArgumentException("negative number" + n);
			
		}else if (n == 0 ) {
			return arr[0];
			
		}else if (n == 1) {
			return arr[1];
			
		}else {
			int f = arr[n];
			if (f == 0) {
				f = fib(n-1) + fib(n-2);
				arr[n] = f;
			}
			// place your changes here
			return f;
		}
	}
	
	/***********************************************************
	 * returns the memoization sequence of numbers, with improved 
	 * efficiency.
	 * @param n the integer n
	 * @throws IllegalArgumentException for negative numbers.
	 * *********************************************************/

	
	/****************************************
	 *   main: runs the program.
	 ****************************************/
	public static void main(String[] args) {
		
		int n = 25;
		System.out.println();
		setArray(n);
		//nth value in memoization series
		System.out.println("---- Memoization with " + n + " values -----");
		for (int i = 0; i < n; i++ ) {
			System.out.println(fib(i) + " ");
		}
		System.out.println();

	}

}
