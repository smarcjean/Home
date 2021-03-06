package hangman;

import java.util.*;

public class GameH {
	public static void main(String[] args) {
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	// get a guess from the player
	Random rand = new Random();
	String[] guesses = {"cat", "dog", "tiger", "lion"}; //declare an array
	 
	
	boolean gameOn = true;
	
	while (gameOn) {
		System.out.println("Welcome to the game!");
		char[] randWordToGuess = guesses[rand.nextInt(guesses.length)].toCharArray();
		
		int  amountOfGuesses =randWordToGuess.length;
		char[] userGuess = new char[amountOfGuesses];
		
		
		
		for (int i = 0; i < userGuess.length; i++) {
			userGuess[i] = '*';
			
		}
		
		boolean theWordIsGuessed = false;
		int tries = 0;
		
    	while (!theWordIsGuessed && tries != amountOfGuesses) {
    		System.out.print("current guess: ");
    		printArray(userGuess);
    		System.out.printf("you have %d tries left.\n", amountOfGuesses - tries);
    		System.out.println("Guess a letter?");
    		char input = scanner.nextLine().charAt(0);
    		tries++;
    		
    		if (input == '*') {
    			gameOn = false;
    			theWordIsGuessed = true;
    		} else {
    			for (int i = 0; i < randWordToGuess.length; i++) {
    				if (randWordToGuess[i] == input) {
    					userGuess[i] = input;
    				}
    			}
    			
    			if (isWordGuessed(userGuess)) {
    				theWordIsGuessed = true;
    				System.out.println("You won!");
    			}
    		}
    		
    	}
	
    	if (!theWordIsGuessed) { System.out.println("You ran out of guesses:/ ");
    	System.out.println("Do you want to play another game?( yes/no)");
    	String anotherGame = scanner.nextLine();
    	if (anotherGame.equals("no")) { gameOn = false;
    	}
    	
    	}
    }
    	
	
	
	System.out.println("Game over");
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		
	}
		System.out.println();
		
	}
	
	public static  boolean isWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '*') {return false;
				
			}
		}
		return true;
	}
}
