package programs;

import java.util.Scanner;

// this program will ask the user to enter a number of names or words
public class Marv {
	
	public static void main(String[] args) {
		// declare a variable to store the array
		
		int arrayLength;
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many names you want to enter: ");
		arrayLength = console.nextInt();
		
		// create the array
		String[] names = new String[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Friend " + (i + 1) + " is ");
			names[i] = console.next();
			
		}
		System.out.println("Your friends names are " );
		for (int i = 0; i < arrayLength; i++) {
			System.out.println( names[i]);
			
			
		}
	}
	

}
