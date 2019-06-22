package work;

public class Factorial {

	public static void main(String[] args) {
		// calculate n! recursively
		
		int r = factorial(4);  
		System.out.println(r);

	}
	
	public static int factorial(int n) {
		if (n ==0) {
			return 1;	
		} else {
			return n * factorial(n - 1); // n * (n - 1)!
		}
	}

}
