package projects;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int num = 7;
		int guess = 0;
		int count = 0;
		
		while (guess != num) {
			System.out.println("enter a guess");
			guess = console.nextInt();
			count++;
			
			if (guess > num) {
				System.out.println("too high");
			} else if (guess < num) {
				System.out.println("too low");
			}
		}
		System.out.println("you win after " + count + " times");

	}

}
