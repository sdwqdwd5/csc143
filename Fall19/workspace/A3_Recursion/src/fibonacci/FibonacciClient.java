package fibonacci;

/***************************************************************************
 * <p> This program demonstrates the technique of recursion and includes 
 *     recursive methods that are defined for a variety of mathematical
 *     functions. 
 ***************************************************************************/
public class FibonacciClient {

	/***********************************************************
	 * returns the result of the Fibonacci sequence of numbers.
	 * @param n the integer n
	 * @throws IllegalArgumentException for negative numbers.
	 * *********************************************************/
	public static int fib(int n) {
		// COMPLETE BODY AND ADD HELPER METHOD BELOW
		if(n < 0) {
			throw new IllegalArgumentException("negative number" + n);
			
		}else if (n == 0 ) {
			return 0;
			
		}else if (n == 1) {
			return 1;
			
		}else {
			// place your changes here
			return 0;
		}
	}
	
	/***********************************************************
	 * returns the fibonacci sequence of numbers, with improved 
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
		
		//nth value in fibonacci series
		System.out.println("---- Memoization with " + n + " values -----");
		for (int i = 0; i < n; i++ ) {
			System.out.println(fib(i) + " ");
		}
		System.out.println();

	}

}
