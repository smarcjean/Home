package projects;
import java.util.*;
// This is an adding game that asks the user to give the sum and 
// you lose after 3 wrong answers. You get 1 point correct 
// answers and 0 point for wrong answers.
public class AddingGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// keep playing till user gets three wrong
		int points = 0;
		int wrong = 0;
		
		while (wrong < 3) {
			int result = play(scan, ran);
			
			if (result > 0) {
				points++;
			} else {
				wrong++;
			}
			
		
		}
	
		System.out.println(" You earned " + points + " points in total");
	}
	
	public static int play(Scanner scan, Random ran) {
		int operands = ran.nextInt(4) + 2;
		int sum = ran.nextInt(10) + 1;
		System.out.print(sum);
		
		for (int i = 2; i <= operands; i++) {
			int n = ran.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
		}
		
		System.out.print(" = ");
		
		// check the user's guess and report
		int guess = scan.nextInt();
		if (guess == sum) {
			return 1;
		} else {
			System.out.println("Wrong! The answer was  " + sum );
			return 0;
		}
	}
}
