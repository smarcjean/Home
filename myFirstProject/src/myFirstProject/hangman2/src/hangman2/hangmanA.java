package hangman2;

import java.util.Scanner;
import java.util.Random;

public class hangmanA {
	public static void main(String[] args) {
	// number of tries before death 
	int maxBadGuess = 15;
	// prompt user
	System.out.println("Print mask = *****");
	System.out.println("Print hint = fruit");
	System.out.println("Guess a letter.");
	
	// get user input
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	String[] guesses = {"Apple", "orange", " peach", "watermelon"};
	
	
	boolean gamePlaying = true;
	while(gamePlaying) {
		System.out.println("Welcome to the hangman game!");
		char[] randomWordToGuess = guesses [random.nextInt(guesses.length)].toCharArray();
		int numberOfGuesses = randomWordToGuess.length;
		char[] userGuess = new char[numberOfGuesses];
		
		for (int i = 0; i < userGuess.length; i++) {
			userGuess[i] = '*';
			
		}
	}

	
	}
}
