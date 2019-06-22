package chapter5;

public class TryingOut {

	public static void main(String[] args) {
	
	int d  =	fractionSum(5);
	System.out.println(d);
		
	}
	
	public static int fractionSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			return sum += (1.0 /i);
		}
		return sum;
	}
	
}
