import java.util.*;


public class MeToo {
	

	public static void main(String[] args) {
		System.out.println("Choose a number between 1 and 20");
		System.out.println("and will tell you when you are to low or too high");
		Scanner console = new Scanner(System.in);
		
		Random rand = new Random();
		int number = rand.nextInt(20);
		
		// get a guess from the user
		System.out.print("take a guess?");
		int guess = console.nextInt();
		int numberOfGuesses = 1;
		
			
	
			
		while (guess != number) {
			System.out.println("incorrect");
			System.out.println("take a guess?");
			guess = console.nextInt();
			numberOfGuesses++;
			
			if (guess > number) {
				System.out.println("you are too high");
				if (guess < number) {
					System.out.println("you are too low");
				}
				
		}	
		}
		
		System.out.println("You got it right after " + numberOfGuesses + " tries");
		
		
	       
		
	   }
		 
	}
	
	
