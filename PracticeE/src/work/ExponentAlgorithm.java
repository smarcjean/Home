package work;

public class ExponentAlgorithm {

	public static void main(String[] args) {
		// calculate a power n recursively
		int d = power(5, 2);
		
		System.out.println(d);

	}
	
	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		} else {
			return a * power(a, n - 1);
		}
	}

}
