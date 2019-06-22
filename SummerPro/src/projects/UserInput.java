package projects;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String phrase;
		do {
			System.out.println("She sells seashells by the seashore.");
			System.out.println("Do you want to hear it again? ");
			phrase = scan.nextLine();
		} while (phrase.equals("y"));
		
	}

}
