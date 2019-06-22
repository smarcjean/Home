package programs;

import java.util.*;

public class InchConversion {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number in inches to convert to feet and to yard");
		number = kb.nextInt();
		
		conversionFromInchesToFeet(number);
		conversionFromInchesToYard(number);
		
	}
	
	public static void conversionFromInchesToFeet(int a) {
		final int INCH_PER_FOOT = 12;
		int result = a / INCH_PER_FOOT;
		
		System.out.println(a + " inches is equal to " + result + " feet");
		
	}
	
	public static void conversionFromInchesToYard(int b) {
		final int INCH_PER_YARD = 36;
		int result = b / INCH_PER_YARD;
		
		System.out.println(b + " inches is equal to " + result + " yard");
	}

}
