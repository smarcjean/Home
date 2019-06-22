package hangman;

import java.util.*;
// Reads a series of numbers and report their average
public class ScannerWithArrays {
	public static void main(String[] args) {
		
		// construct a Scanner constructor
		Scanner sc = new Scanner(System.in);
		// ask for user input
		System.out.print("How many numbers you want to enter");
		// declare a variable to store the user's input
		int nums = sc.nextInt();
		// declare a variable to keep track or add up the numbers
		int sum = 0; 
		
		// use a for loop to go through the numbers 
		for (int i = 1; i <= nums; i++ ) {
			System.out.print("Number " + i + " is ");
			int n = sc.nextInt();
			sum += n;
		}
		
		// find the average of the numbers
		double av = sum / nums;
		System.out.println("Average is " + av);
	}

}
