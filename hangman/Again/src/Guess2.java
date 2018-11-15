// Two-digit number-guessing game with hinting.
import java.util.*;

public class Guess2 {
	public static void main(String[] args) {
		System.out.println("Try to guess my two-digit");
		System.out.println("number, and I will tell you how");
		System.out.println("many digits from you guess");
		System.out.println("appear in my number");
		System.out.println();
		
		Scanner userInput = new Scanner(System.in);
		
		// pick a random number from 0 to 99 inclusive
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		// get first guess
		System.out.print("Your guess?");
		int guess= userInput.nextInt();
		int numGuesses = 1;
		
		// give hints until correct guess is reached
		while ( guess != number) {
			int numMatches = matches(number, guess);
			System.out.println("Incorrect (hint: " + 
			                         numMatches + " digits match");
			System.out.print("Your guess?");
			guess = userInput.nextInt();
			numGuesses++;
			
		}
		
		System.out.println("You got it right in " + numGuesses + " tries");
		
	}
	
	// returns how many digits from the given
	// guess match digits from the given correct number
	private static int matches(int number, int guess) {
		int numMatches = 0;
		
		if (guess / 10 == number / 10 ||
				guess / 10 == number % 10) {
			numMatches++;
			
		}
	
		if (guess / 10 != guess % 10 && (guess % 10 == number / 10 || 
				guess % 10 == number % 10)) {
			numMatches++;
		}
		
		return numMatches;
	}

}
