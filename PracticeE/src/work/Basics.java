package work;

import java.util.Scanner;

public class Basics {
	
public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	String word = "lola";
	String guess = "";
	int countGuess = 0;
	int chances = 4;
	boolean outOfGuesses = false;
	boolean playAgain = true;
	
	while (!guess.equals(word) && !outOfGuesses) {
		
			if (countGuess < chances) {
			System.out.print("Enter a guess: ");
			
			guess = userInput.nextLine();
			countGuess++;
		}	 else {
				outOfGuesses = true;
		}
		
		}

			if (outOfGuesses) {
				System.out.print("you lose! no more chances ");

		}	else {
				System.out.print("you won ");
		}
 
		}

		

		}
