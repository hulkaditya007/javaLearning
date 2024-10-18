package javalearning;

public class FactorialWithRec {

	public static void main(String[] args) {
		int a = 5;
		//int result = 1;

		System.out.print(factorial(a));
		
	}

		 // Recursive method to calculate factorial
	    public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // Base case: factorial of 0 or 1 is 1
	        } else {
	            return n * factorial(n - 1); // Recursive call to factorial method
	        }
	    }
}
