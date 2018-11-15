package hangman2;

import java.util.*;

public class Numbers {
	public static void main(String[] args) {
		System.out.println("This program adds a sequence of ");
		System.out.println("numbers.");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		// when you want to add a series of numbers it is good to
		// use the sum method
	System.out.print("How many numbers do you have? ");
	int totalNumber = console.nextInt();
	
	double sum = 0.0;
	for (int i = 1; i <= totalNumber; i++) {
		System.out.print("  #" + i + "? ");
		double next = console.nextDouble();
		sum += next;
	}
	System.out.println();
	
	System.out.println("sum = " + sum);
	}

}
