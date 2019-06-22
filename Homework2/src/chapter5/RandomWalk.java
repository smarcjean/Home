package chapter5;

import java.util.*;

// This program performs steps in a random one-demensional walk.
// the walk should begin at position 0 and on each step its either increase or decrease the 
// the position until a position of 3 or -3 is reached.
public class RandomWalk {
	public static void main(String[] args) {
		
		randomWalk();
		
	}
	// create the random walk
	public static void randomWalk() {
	    int position = 0;
	    int max = 0;
	    Random rand = new Random();
	    int step;
	    
	    while(-3 < position && position < 3) {
	        System.out.println("position = " + position);
	        step = rand.nextBoolean() ? -1 : 1;
	        position += step;
	        max = Math.max(max, position);
	    }
	    
	    System.out.println("position = " + position);
	    System.out.println("max position = " + max);
	}
}
