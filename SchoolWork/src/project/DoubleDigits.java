package project;

public class DoubleDigits {

	public static void main(String[] args) {
		int n = -348;
	int d =	doubleDigits(n);
	System.out.print(d);
	}
	
	public static int doubleDigits(int n) {
		int c = 0;
		if (n < 0) {
		 c =	-doubleDigits(n - 1 + 1 );// + doubleDigits(n + 1);
			
		} else {
			return doubleDigits(n - 1 + 1);
		}
		return n;
	}

}
