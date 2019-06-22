package projects;
import java.util.*;

public class RunningSum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner("3.25 4.5 -8.25 7.25 3.5 4.25 -6.5 5.25");
		runningSum(input);
	}
	
	
	public static void runningSum(Scanner input) {
		double prev = 0;
		double next = 0;
		int numLine = 6;
		double maxSum= 0;
		String currentNum = input.next();;
		String nextNum = "";
		System.out.print("Running sum = ");
		while (input.hasNextLine()) {
			nextNum = input.next();
			prev = Double.parseDouble(currentNum);
			next = Double.parseDouble(nextNum);
			System.out.print("\t" + prev);
			prev = prev + next; 
			currentNum= String.valueOf(prev);
			if (prev > maxSum) {
				maxSum = prev;
			}
		}
		System.out.println("\t"+ prev);
		System.out.print("Max Sum: "+ maxSum);

	}

	

}
