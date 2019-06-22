package programs;

import java.util.*;

public class Percentages2 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Enter an integer");
		num1 = kb.nextDouble();
		System.out.println("Enter another integer");
		num2 = kb.nextDouble();
		
		computePercent(num1, num2);
		computePercent(num2, num1);
		
	}
	
	public static void computePercent(double a, double b) {
		System.out.println(a + " is " + (int)(a * 100 / b) + " percent of " + b );
		
	}


}
