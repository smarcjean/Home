package hangman;
import java.util.*; 


public class hangman2 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		// get a random letter
		Random random = new Random();
		String[] guesses = {"cat", "dog", "bird", "tiger"};
		
		boolean playing = true;
		while (playing) {
			System.out.println("Welcome to the game!");
			char[] GuessingWord = guesses[random.nextInt(guesses.length)].toCharArray();
			int amountOfGuesses = GuessingWord.length; //100
			char[] playerGuess = new char[amountOfGuesses];//-----
		
			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i]= '-';
			}
			
			boolean guessedWord = false;
			int tries = 0;
			
			while (!guessedWord && tries != amountOfGuesses) {
				  System.out.print("Current guesses:");
				  printArray(playerGuess);
				
				System.out.println("Enter a single character.");
				char input = scanner.nextLine().charAt(0);//
				tries++;
				
				if (input =='-') {
					playing = false;
					guessedWord = true;
				} else {
					for (int i = 0; i < GuessingWord.length; i++) {
						if(GuessingWord[i] == input);
						playerGuess[i] = input;
				}
				
			}
				if (isTheWordGuessed(playerGuess)) {
					guessedWord = true;
					System.out.println("Congratulations you won!");
				}
				
			
		
		// ask if player want to play another game
		
		  if (!guessedWord)  System.out.println("You ran out of guesses./");{
				 System.out.println("Do you want to play again? (Yes/No");
				 String anotherGame = scanner.nextLine();
		  if (anotherGame.equals ("no")) playing = false;
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