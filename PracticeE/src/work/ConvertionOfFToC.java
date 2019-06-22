package work;

import java.util.Scanner;

public class ConvertionOfFToC {
	
	// This program converts fahrenheit to celsius and yard

	public static void main(String[] args) {
		double F;
		int C;
		Scanner input = new Scanner(System.in);
		
		boolean playing = true;
		
		// prompt user 
		
		while(playing) {
			System.out.println("Enter a number to convert: ");
			
		F = input.nextDouble();
		C = (int) ((F-32) * 5)/9;
		// converts
		
		System.out.printf("%.1f F = %d C,\n", F,C);
		
		   
		}
	}
}
