import java.util.*;


public class NumberGuess {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int number = 10; // always picks the same number
		
		System.out.print("Guess a number?");
		int guess = console.nextInt();
		int numGuesses = 1;
		
		while (guess != number) {
			System.out.println("Incorrect number.");
			System.out.print("Guess a number?");
			guess = console.nextInt();
			numGuesses++;
		}
		System.out.println("You got it after " + numGuesses + " tries.");
	}
	
}	