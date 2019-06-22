package chapter5;

import java.util.*;
// This program prints a line that contain random number of x between
// 5 and 20 inclusive until it prints a line that contains 16 or more characters.
public class RandomX {
	
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		randomX();	
	}
     // print x randomly
	public static void randomX() {
		int b;
		
		do {
		b =  rand.nextInt(15) + 5;
		for (int i = 0; i <= b ; i++) {
			System.out.print("x");
		}
		System.out.println();
		
		} while(b < 16);
		
	}
}

