package hangman2;

import java.util.Scanner;
import java.util.Random;

public class hangman {
	public static void main(String[] args) {
		
	
		// get user input
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] guesses = {"apple", "orange", " peach", "watermelon"};
		
		
		boolean asGameOn = true;
		while(asGameOn) {
			System.out.println("Welcome to hangman game!");
			char[] randomGuessingWord = guesses[random.nextInt
			                    (guesses.length)].toCharArray();
			int numGuesses = randomGuessingWord.length;
			char[] userGuess = new char[numGuesses];
			
			for (int i = 0; i < userGuess.length; i++) {
			     userGuess[i] = '*';
				
			}
			
			boolean wordGuessed = false;
			int tries =0;
			
			while (!wordGuessed && tries != numGuesses) {
				System.out.print("Current guesses:");
				printArray(userGuess);
				System.out.printf("You have %d tries left.\n", numGuesses + tries);
				System.out.println("Enter a single character");
				char input = scanner.nextLine().charAt(0);
				tries++;
				
				if (input == '*') {
					asGameOn= false;
					wordGuessed = true;
				} else {
					for (int i = 0; i < randomGuessingWord.length; i++) {
						if (randomGuessingWord[i] == input) {
							userGuess[i] = input;
							
					}
				}
					
				if (isWordGuessed(userGuess)) {
					wordGuessed = true;
					System.out.println("Congratulations you won!");
					
				}	
				
			}
				
				
			}
			
			if (!wordGuessed) System.out.println("You ran out of guesses:/");	
			System.out.println("Do you want to play again? (Yes/No)");
			String anotherGame = scanner.nextLine();
			if (anotherGame.equals("no")) asGameOn = false;
			
		}
		
		System.out.println("Game over.");
		
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
	}

		System.out.println();
		
	}
	
	public static boolean isWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '*') return false;
	}
		return true;
}
}
