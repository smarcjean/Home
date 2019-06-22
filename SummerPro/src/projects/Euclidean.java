package projects;

public class Euclidean {

	public static void main(String[] args) {
		int d = gcd(12, 7);
		System.out.println(d);
	}
	
	public static int gcd(int x, int y) {
		
		while (x != 0) {
			int r = y % x;  // dividend becomes divisor and divisor becomes remainder.
			y = x;
			x = r;
		}
		return y;
	}

}
