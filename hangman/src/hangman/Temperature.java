package hangman;
import java.util.*;

// Reads a series of high temperatures and reports the
// average and the number of days above average
public class Temperature {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// gets input
		System.out.print("How many days' of high temps: ");
		// declare a variable to store the values or input
		int numDays = sc.nextInt();
		// declare an array to store the temps
		int[] temps = new int[numDays];
		
		// declare a variable to keep track of the total
		int sum = 0;
		// declare a variable to to keep track of temps above average
		int above = 0;
		
		for (int i = 0; i < numDays; i++) {
			System.out.print("Day " + (i + 1) + " is ");
			temps[i] = sc.nextInt(); // store the temps or values in the array
			sum += temps[i];
			
		}
		
		// find the average
		double av = sum / numDays;
		
		// find temps above av
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] > av) {
				above++;
				
			}
			if (temps[i] > av) {
				System.out.println(above + " above av " + temps[i]);
			}
			
		}
		
		System.out.println("Average is " + av);
		
	}

}
