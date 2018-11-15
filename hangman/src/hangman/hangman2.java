package hangman;
import java.util.*; 


public class hangman2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] guesses = {"apple", "dictionary", "notebook", "language"};
		
		boolean weArePlaying = true;
		while (weArePlaying) {
			System.out.println("Welcome to the game!");
			char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
			int amountOfGuesses = randomWordToGuess.length; //100
			char[] playerGuess = new char[amountOfGuesses];//-----
		
			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i]= '-';
			}
			
			boolean wordIsGuessed = false;
			int tries = 0;
			
			while (!wordIsGuessed && tries != amountOfGuesses) {
				  System.out.print("Current guesses:");
				  printArray(playerGuess);
				System.out.printf("You have %d tries left.\n, amoutOfGuesses - tries");
				System.out.println("Enter a single character.");
				char input = scanner.nextLine().charAt(0);//
				tries++;
				
				if (input =='-') {
					weArePlaying = false;
					wordIsGuessed = true;
				} else {
					for (int i = 0; i < randomWordToGuess.length; i++) {
						if(randomWordToGuess[i] == input);
						playerGuess[i] = input;
				}
				
			}
				if (isTheWordGuessed(playerGuess)) {
					wordIsGuessed = true;
					System.out.println("Congratulations you won!");
				}
				
			
		
		
		
		  if (!wordIsGuessed)  System.out.println("You ran out of guesses./");{
				 System.out.println("Do you want to play again? (Yes/No");
				 String anotherGame = scanner.nextLine();
		  if (anotherGame.equals ("no")) weArePlaying = false;
			}
		 }
	  }
		
	        	System.out.println("Game over.");
		
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
	}
		System.out.println();

   }
	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '-') return false;
		
	}
		return true;
	}
}