package chapter5;

import java.util.*;

// This program adds up the results of two dice till a desired dice sum is reach.
public class DiceSum {
	
	public static void main(String[] args) {
		
		 Scanner console = new Scanner(System.in);
		 diceSum(console);
	}
	// roll dice 1 and roll dice 2 and add their results till it reaches the desired sum of
	// the two dice and then prints the results
	// the user dictates the desired sum
	public static void diceSum(Scanner console) {
	   
	    System.out.print("Desired dice sum: ");
	    int sum = console.nextInt();
	    Random rand1 = new Random();
	    Random rand2 = new Random();
	    int dice1;
	    int dice2;
	    
	    do {
	        dice1 = rand1.nextInt(6) + 1;
	        dice2 = rand2.nextInt(6) + 1;
	        System.out.println(dice1 + " and " + dice2 + " = " + (dice1 + dice2));
	    } while(dice1 + dice2 != sum);
	}
}
