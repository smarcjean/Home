package work;

import java.util.Arrays;

public class EuclideanGCD {

	public static void main(String[] args) {
		
		int answer;
		answer = gcd(12,5);
		System.out.println(answer);
	}
	
	public static int gcd(int a, int b) {
		int x = a;
		int y = b;
		
		while(y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

}
