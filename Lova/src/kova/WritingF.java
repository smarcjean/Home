package kova;

import java.io.*;
import java.util.Scanner;

public class WritingF {
	
	public static void main(String[] args) throws FileNotFoundException{
		PrintStream output = new PrintStream(new File("dances.txt"));
		output.println("Hello, world.");
		output.println("How are we going to do this?");
		output.println("I don't know yet but we will figure it out.");
		
		
		
		
		File file = new File("dances.txt");
		System.out.println("exists returns " + file.exists());
		System.out.println("canRead returns " + file.canRead());
		System.out.println("length returns " + file.length());
		System.out.println("getAbsolutePath returns " + file.getAbsolutePath());
		
	
	
	Scanner input = new Scanner(file);
	int count = 0;
	while(input.hasNext()) {
	String words = input.next();
	count++;
	}
	System.out.println("total words = " + count);
	
	}
}
