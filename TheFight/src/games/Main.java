package games;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;





public class Main {
	public static int incorrect = 0;

	 
	public static List<Game> loadingGames() throws IOException {
		ArrayList<Game> games = new ArrayList<Game>();
		
		
		BufferedReader br = new BufferedReader(new FileReader("GameQuestions.txt"));
		
		while(br.ready() != false) {
		
			String QuestionAndAnswer = br.readLine();
			String[] line = QuestionAndAnswer.split(": ");
			Game g = new Game();
			g.setQuestion(line[0]);
			g.setAnswer(line[1]);
			games.add(g);	
			
		}
		br.close();
		
		return games;
	}
 
	public static void startGame(Game game) {
		Scanner console = new Scanner(System.in);
		while (!game.outOfChances() && !game.answerIsGuessed) {
			System.out.println();
			System.out.println("Question:" );
			System.out.println();
			System.out.println(game.getQuestion());
			System.out.println("Answer: " );
			game.setUserGuess(console.next());
			 
			if(game.getUserGuess().equals(game.getAnswer()))
			{
				System.out.println("Your answer is correct.");
				game.answerIsGuessed = true;
			}
			else {
				System.out.println("Your answer is incorrect! You have lost one chance.");
				game.setChances(game.getChances()- 1);
				System.out.println("Your chances are " + game.getChances());
			}
			 
			if (game.outOfChances()) {
				System.out.println("You are out of chances!");
				incorrect++;
			}
			
		}
	}
	
 
	public static void main(String[] args) {
		System.out.println("Welcome to the game!");
		List<Game> games;
		try {
			games = Main.loadingGames();
		
			for(Game game:games){
				startGame(game);
			}
			System.out.println();
			System.out.println("This is the end.");
			System.out.println("You got " + incorrect + " questions wrong.");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 

