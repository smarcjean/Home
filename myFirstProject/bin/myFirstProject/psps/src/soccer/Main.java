package soccer;

import java.io.*;
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
		while (!game.outOfTries() && !game.answerIsGuessed) {
			System.out.println();
			System.out.println("Question:" );
			System.out.println();
			System.out.println(game.getQuestion());
			System.out.println("Answer: " );
			game.setUserGuess(console.next());
			 
			if(game.getUserGuess().equalsIgnoreCase(game.getAnswer()))
			{
				System.out.println("Your answer is correct.");
				game.answerIsGuessed = true;
			}
			else {
				System.out.println("Your answer is incorrect.");
				game.setTries(game.getTries()- 1);
				System.out.println("You have " + game.getTries() + (" tries"));
			}
			 
			if (game.outOfTries()) {
				System.out.println("You are out of chances!");
				game.getAnswer();
				game.answerIsGuessed = true;
				System.out.println("Answer: " + game.getAnswer());
				
				
				
				incorrect++;
			}
			
		}
	}
	
 
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the game!");
		System.out.println("You will be asked a question and you give the answer.");
		System.out.println("If run out of tries and not know the answer");
		System.out.println("The game will give you the answer");
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
