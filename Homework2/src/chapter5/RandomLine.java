package chapter5;

import java.util.*;

// This program prints some random strings of letters between 5 and 10 per line
// with random length up to 80 characters

public class RandomLine {
	
	public static void main(String[] args) {
		randomLines();
	}
	// prints the random lines and characters
	public static void randomLines() {
		
		 Random rand1 = new Random();
		 
		 String letters = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		 int numLine = rand1.nextInt(6) + 5;
		    
		    for(int i = 0; i < numLine; i++) {
		        Random rand2 = new Random();
		        int length = rand2.nextInt(80) + 1;
		        
		        for(int j = 0; j < length; j++) {
		            int line = rand2.nextInt(26);
		            char c = letters.charAt(line);
		            System.out.print(c);
		            
		        }
		        System.out.println();
		    }
		   
	}
}
