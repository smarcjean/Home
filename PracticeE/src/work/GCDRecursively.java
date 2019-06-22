package work;

public class GCDRecursively {

	public static void main(String[] args) {
		// calculating gcd(a,b) recursively
		int answer = gcd(5, 15);
		System.out.println(answer);

	}
	
	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return gcd(b % a, a);
		}
	}

}
