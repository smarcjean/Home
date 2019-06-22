package projects;

public class TesterRecursion {
	private static int count = 0;
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			count = 0;
			int n = (int)Math.pow(2, i);
			
			int fibn = fibonacci(n);
			System.out.println("" + n + ":" + count);
		}
	}
	
	public static int fibonacci(int n) {
		count++;
		if (n <= 2) {
			return 1;
			
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
