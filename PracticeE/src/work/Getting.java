package work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Getting {
	

	// Store game definitions in a file.
		// Word : hint
	// Done.

//- Load a List of games from a file
	// Read from file, Create list of games.
	public static List<Guessing> loadGames() throws IOException {
		
		List<Guessing> games = new ArrayList<Guessing>();
		BufferedReader br = new BufferedReader(new FileReader("HagmanTheGames.txt"));
		while (br.ready() !=false) {
			
			String wordAndHint = br.readLine();
			String[] line = wordAndHint.split(":");
			Guessing g = new Guessing();
			g.setWord(line [0]);
			g.setHint(line[1]);
			games.add(g);
		
	}
		br.close();
		return games;
		
	}
		// Play the game. Take user guesses and update the mask, check to see if game is won.
			
		public static void play(Guessing hangmanGame) {
			Scanner console = new Scanner(System.in);
			
			while(!hangmanGame.outOfLives() && !hangmanGame.theWordIsGuessed()) {
				System.out.println("The mask word is: " + hangmanGame.mask());
				System.out.println("The hint for the word is: " + hangmanGame.getHint());
				System.out.println();
				System.out.println("Guess a letter:");
				String guess = console.next();
				hangmanGame.setGuesses(hangmanGame.getGuesses() + guess);
				
				if(!hangmanGame.getWord().contains(guess)) {
					System.out.println("You lost one chance.");
					hangmanGame.setLives(hangmanGame.getLives() - 1);
				} 
				else {
					System.out.println("You guessed one letter correctly.");
				} 
				}
			if (hangmanGame.outOfLives()) {
				System.out.println("You have to more lives");
			
			}
			if (hangmanGame.theWordIsGuessed()){
				
				System.out.println("You guessed it.");
			} 
		}
		
		
				
			
			public static void writeTheResults(Guessing hangmanGame) {
				// write each games results out to a log file
				// write to a file
				FileWriter fStream;
				try {
					fStream = new FileWriter("HangmanResults.txt", true);
					BufferedWriter bw = new BufferedWriter(fStream);
					bw.write(hangmanGame.getWord());
					if (hangmanGame.theWordIsGuessed()) {
						bw.write(": Guessed");
					} else {
						bw.write(": Not guessed");
					}
					bw.write("\r\n------------\r\n");
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			
			// Allow the user to play multiple games, back to back, without restarting 
			//the application.
			// Main function, loops while there are games to play.
			
			public static void main(String[] args) throws IOException {
				List<Guessing> games;
				games = Getting.loadGames();
				for (Guessing hangmanGame:games) {
					Getting.play(hangmanGame);
					Getting.writeTheResults(hangmanGame);
				}
			}
		}
		
		

	

	
	
	
	
	
	
	
	
	
	
	