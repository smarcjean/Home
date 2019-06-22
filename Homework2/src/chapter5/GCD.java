package chapter5;

// This program accepts two integers and print out their greatest common divisor
public class GCD {
	
	public static void main(String[] args) {
		System.out.println(gcd(8, 0));
		
	}
	// print the gcd
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
