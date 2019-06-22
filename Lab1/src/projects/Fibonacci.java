package projects;

public class Fibonacci {
	public static void main(String[] args) {
		int dot = fibonacci(5);
		System.out.println(dot);
		
	}
	
	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci (n - 1) + fibonacci(n - 2);
		}
	}

}
