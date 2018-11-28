package hangman;

import java.util.*;

public class hangman {
public static void main(String[] args) {
	
	giveIntro();
	
	Scanner console = new Scanner(System.in);

	
	// pick a random number between 0 to 10
	Random rand = new Random();
	int number = rand.nextInt(10);
	
	// get first guess
	System.out.print("Your guess?");
	int guess = console.nextInt();
	int numGuesses = 1;
	
	
	// prompt user
	while (guess != number) {
		System.out.print("Incorrect.");
		System.out.println("Your guess?");
		guess = console.nextInt();
		numGuesses++;
		
	}
	System.out.println("You got it right after " + numGuesses + " tries.");
	

}

public static void giveIntro() {
	System.out.println("Let us play together.");
}
}
