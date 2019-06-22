package chapter5;

import java.util.*;
// This program guesses number between 1 to 50 inclusively and prints untill it makes
// a guess at least 48
public class MakeGuesses {
	
	public static void main(String[] args) {
		
		makeGuesses();
	}
	// make guesses
	public static void makeGuesses() {
	    
	    Random rand = new Random();
	    int count = 0;
	    int guess;
	    
	    do {
	        guess = rand.nextInt(50) + 1;
	        count++;
	        System.out.println("guess = " + guess);
	    } while(guess < 48);
	    
	    System.out.println("total guesses = " + count);
	}
}
