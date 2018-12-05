package kova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hang7Buddy {
	
	// Store game definitions in a file.
		// Word : hint
	// Done.

//- Load a List of games from a file
	// Read from file, Create list of games.
	
	public static List<Hangman7> loadGames() throws IOException {
		
		List<Hangman7> hangmanGames = new ArrayList<Hangman7>();
		
		BufferedReader br = new BufferedReader(new FileReader("HangmanGames.txt"));
		
		while(br.ready() != false)
		{
			String wordAndHint = br.readLine();
			String[] line = wordAndHint.split(":");
			Hangman7 h = new Hangman7();
			h.setWord(line[0]);
			h.setHint(line[1]);
			hangmanGames.add(h);
		}
		
		br.close();
		
		return hangmanGames;
		
	}
	
	// Play the game. Take user guesses and update the mask, check to see if game is won.
	
	public static void play(Hangman7 hangmanGame) {
		Scanner console = new Scanner(System.in);
					
		while (!hangmanGame.noMoreChances() && !hangmanGame.wordIsGuessed()) {
			System.out.println("The mask word is: " + hangmanGame.mask());
			System.out.println("The hint for the word is: " + hangmanGame.getHint());
			System.out.println();
			System.out.println("Guess one letter at a time: ");
			String guess = console.next();
			hangmanGame.setGuesses(hangmanGame.getGuesses() + guess);
			
			if (!hangmanGame.getWord().contains(guess)) {
				System.out.println("You lost one chance.");
				hangmanGame.setChances(hangmanGame.getChances() - 1);
			} 
			else {
				System.out.println("You guessed one letter correctly.");
			} 
		}
		
		if(hangmanGame.noMoreChances()) {
			System.out.println("You have no more chances.");
		}
		if(hangmanGame.wordIsGuessed())
		{
			System.out.println();
			System.out.println("Nice! You got it!");
			System.out.println();
		}
		
	}
	
	public static void writeResults(Hangman7 hangmanGame) throws IOException {
		
		// Write each games results out to a log file.
		// Write to file.
		
		FileWriter fstream = new FileWriter("HangmanResults.txt", true);
		BufferedWriter bw = new BufferedWriter(fstream);
		bw.write(hangmanGame.getWord());
		if(hangmanGame.wordIsGuessed()) {
			bw.write(": Guessed");
		}
		else {
			bw.write(": Not guessed");
		}
		bw.write("\r\n-------------------\r\n");
		bw.close();
	}

// Allow the user to play multiple games, back to back, without restarting the application.
	// Main function, loops while there are games to play.
	
	public static void main(String[] args){
		List<Hangman7> hangmanGames;
		try {
			hangmanGames = Hang7Buddy.loadGames();
			for(Hangman7 hangmanGame:hangmanGames){
				Hang7Buddy.play(hangmanGame);
				Hang7Buddy.writeResults(hangmanGame);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	
	

	// Make sure to uses lists, organize your code, provide good names, comments, and follow the Java conventions.

}
