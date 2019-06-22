package hangman;

import java.util.Scanner;
// reads a series of high temperatures and reports the average
public class Arrays {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("how many number you want to enter? ");
		int nums = console.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= nums; i ++) {
			System.out.println("Day " + i + " is " );
			int n = console.nextInt();
			sum += n;
		}
		
		double av = sum / nums;
		System.out.println("Average is " + av);
	}

}
