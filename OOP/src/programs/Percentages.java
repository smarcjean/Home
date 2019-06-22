package programs;

public class Percentages {
	public static void main(String[] args) {
		double num1 = 2.0, num2 = 5.0;
		
		computePercent(num1, num2);
		computePercent(num2, num1);
		
	}
	
	public static void computePercent(double a, double b) {
		System.out.println(a + " is " + (int)(a * 100 / b) + " percent of " + b );
		
	}
	

}
