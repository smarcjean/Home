import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;







public class AmiC {
	public static List<Amer> loadingGames() throws IOException {
		ArrayList<Amer> amor = new ArrayList<Amer>();
		
		
		BufferedReader br = new BufferedReader(new FileReader("AmericaSays.txt"));
		
		while(br.ready() != false) {
		
			String QuestionAndAnswer = br.readLine();
			String[] line = QuestionAndAnswer.split(": ");
			Amer m = new Amer();
			m.setQuestion(line[2]);
			m.setAnswer(line[1]);
			amor.add(m);	
			
		   }
		    br.close();
		
		    return amor;
	    }
	public static void startAmer( Amer ama) {
		Scanner console = new Scanner(System.in);
		while (!ama.wordIsSolved && !ama.outOfTries()) {
			
			
			System.out.println();
			System.out.println("Question:" );
			System.out.println();
			System.out.println(ama.getQuestion());
			System.out.println("Answer: " );
			ama.setGuess(console.next());
		
			 
			if(ama.getGuess().equalsIgnoreCase(ama.getAnswer()))
			{
				System.out.println("Your answer is correct.");
				ama.wordIsSolved = true;
			}
			else {
				System.out.println("Your answer is incorrect.");
				ama.setTries(ama.getTries()- 1);
				System.out.println("You have " + ama.getTries() + (" tries"));
			}
			 
			if (ama.outOfTries()) {
				System.out.println("You are out of chances!");
				ama.getAnswer();
				ama.wordIsSolved = true;
				System.out.println("Answer: " + ama.getAnswer());
				
				
				
			
			
			
		}
	}
	
	}
public static void main(String[] args) {
		
		
		System.out.println("Welcome to the game!");
		System.out.println("You will be asked a question and you give the answer.");
		System.out.println("If run out of tries and not know the answer");
		System.out.println("The game will give you the answer");
		List<Amer>amor ;
		try {
			amor = AmiC.loadingGames();
		
			for(Amer ama: amor){
				startAmer(ama);
			}
			System.out.println();
			System.out.println("This is the end.");
			System.out.println("You got questions wrong.");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 

