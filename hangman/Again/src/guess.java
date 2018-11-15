import java.util.*;
public class guess {
public static void main(String[] args) {
	
	Scanner console = new Scanner(System.in);
	int number = 42;
	
	
	System.out.print("Your guess?");
	int guess = console.nextInt();
	int numGuesses =1;
	
	while (guess != number) {
		System.out.println("Incorrect.");
		System.out.println(" Your guess?");
		guess = console.nextInt();
		numGuesses++;
	}
	System.out.println("You got it right in " + numGuesses + "tries");
}
}
