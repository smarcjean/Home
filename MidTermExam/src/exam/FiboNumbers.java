package exam;

public class FiboNumbers {

	public static void main(String[] args) {
		
		
	}
	
	public static int fibonacci(int n) {
	    if (n <= 2) {
	        return 1;
	    } else {
	        return fibonacci(n, 3, 1, 1);
	    }
	}

	private static int fibonacci(int n, int i, int prev, int curr) {
	    if (n == i) {
	        return prev + curr;
	    } else {
	        return fibonacci(n, i + 1, curr, prev + curr);
	    }
	}

}
