package projects;
import java.util.*;

public class TowersOfHanoi {
	public static void main(String[] args) {
		// Obtain the number of rings from the use.
		// Call the recursive move method to move the rings from peg 1 to peg 3
		// with peg 2 available for intermediate usage.
		// precondition .. number of rings != 64.
		// Postconditions .. the moves are printed in the terminal window
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of rings: ");
		int numberOfRings = reader.nextInt();
		move (numberOfRings, 1, 3, 2);
		
	}
	private static void move(int n, int i, int j, int k) {
		if (n > 0) {
			move(n - 1, i, k, j);
			System.out.println("Move ring " + n + " from peg " + i + " to " + j);
			
			move(n - 1, k, j, i);
		}
	}

}
