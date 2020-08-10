package recursion;

/***************************************************************************
 * <p> This program demonstrates the technique of recursion and includes 
 *     recursive methods that are defined for a variety of mathematical
 *     functions. 
 *         
 * <br>A recursive method is one that directly or indirectly calls itself 
 *     and must include:
 * <br>(1) end case:  stopping condition
 *                    which terminates/ends recursion
 * <br>(2) reduction: reduces the problem into a subproblem, which is a
 *                 	  smaller or simpler version of the original problem.
 *                 
 * <br> The recursive call is a call of the method with a smaller or 
 *      different argument. Normally, a recursive call reduces the original 
 *      problem by bringing it increasingly closer to an end case, until it 
 *      becomes the end case.
 ***************************************************************************/
public class RecursionClient {
	
	/***********************************************************
	 * returns the result of an real value x to the nth power.
	 * @param n the integer n 
	 * *********************************************************/
	/***********************************************************
	* returns the result of an real value x to the nth power.
	* @param n the integer n
	* *********************************************************/
	public static double exp(double x, int n) {
		if (n == 0) {
			return 1;
		}else if (n > 0) {
			return x * exp(x,n-1);
		}
		throw new IllegalArgumentException();
	}

	/************************************************************
	* returns the result of a factorial down to zero factorial
	* @param n  positive integer and zero
	* @throws IllegalArgumentException for negative numbers.
	* **********************************************************/
	public static int fac(int n) {
		if (n > 0) {
			return n * fac(n-1);
		}else if (n==0) {
			return 1;
		}
		throw new IllegalArgumentException();
	}

	/***********************************************************
	* returns the result of the memoization sequence of numbers.
	* @param n the integer n
	* @throws IllegalArgumentException for negative numbers.
	* *********************************************************/
	public static int fib(int n) {
		if (n > 1) {
			return fib(n-1) +fib(n-2);
		}else if (n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		throw new IllegalArgumentException();
	}


	/***********************************************************
	* returns the result of an integer x to the nth power.
	* @param n the integer n
	* @throws IllegalArgumentException for negative exponents.
	* *********************************************************/
	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}else if (n > 0) {
			return x * pow(x,n-1);
		}
		throw new IllegalArgumentException();
	}

	/***********************************************************
	* returns the result of the sum of n integers.
	* @param n the integer n
	* @throws IllegalArgumentException for negative numbers.
	* *********************************************************/
	public static int sum(int n) {
		if (n > 0) {
			return n + sum(n-1);
		}else if ( n== 0) {
			return 0;
		}
		throw new IllegalArgumentException();
	}

	/***********************************************************
	* returns the result of the sum of n integers.
	* @param n the integer n
	* @throws IllegalArgumentException for negative numbers.
	* *********************************************************/
	public static int sumOdd(int n) {
		if (n > 0) {
			return n*2-1 + sumOdd(n-1);
		}else if (n == 0) {
			return 0;
		}
		throw new IllegalArgumentException();
	}
	
	/***********************************************************
	 * runs the program
	 * @param args program arguments
	 * *********************************************************/
	public static void main(String[] args) {
		
		int n = 10;
		
		//count of nth factorial
		System.out.println("------------- nth factorial --------------");
		for (int i = 0; i < n; i++ ) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//value for nth factorial 
		for (int i = 0; i < n; i++ ) {
			System.out.print(fac(i) + "\t");
		}
		System.out.println();
		
		n = 12;
		System.out.println();
		
		//count of nth memoization
		System.out.println("-------------- nth memoization -------------");
		for (int i = 0; i < n; i++ ) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//nth value in memoization series
		for (int i = 0; i < n; i++ ) {
			System.out.print(fib(i) + "\t");
		}
		System.out.println();
		
		
		//two to the power of  n
		n = 16;
		double two$n = Math.pow(2, n);
		System.out.println();
		System.out.println("-------------- pow(2, n) -------------");
		System.out.println("pow(2, n): " + n + " gives " + two$n);
		System.out.println("pow(2, n): " + n + " gives " + pow(2, n));
		System.out.println();
		
		//e to the power of  n
		n = 8;
		double e$n = Math.pow(Math.E, n);
		System.out.println("-------------- exp(x,n) -------------");
		System.out.println("e(n):      " + n + " gives " + e$n);
		System.out.println("exp(e, n): " + n + " gives " + exp(Math.E, n));
		
		n = 10;
		System.out.println();
		
		//summation of n integers
		int sum = n * (n + 1) / 2;
		System.out.println("-------------- sum(n) -------------");
		System.out.println("sum of " + n + " integers: " + sum);
		System.out.println("sum of " + n + " integers: " + sum(n));
		
		n = 5;
		System.out.println();
		System.out.println("-------------- sumOdd(n) -------------");
		//summation of first n odd integers
		int sumOdd = 0;
		for (int i = 1; i < n + 1; i++ ) {
			sumOdd = sumOdd + 2 * i - 1;
			System.out.print(sumOdd + " ");
		}
		
		System.out.println();
		System.out.println("first " + n + " odd integers: " + sumOdd);
		System.out.println("first " + n + " odd integers: " + sumOdd(n));
	}

}
