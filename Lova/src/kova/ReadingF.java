package kova;

import java.io.*;
import java.util.*;

// Words count and prompt user for a file name
public class ReadingF {
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner console = new Scanner(System.in);
		Scanner input = getInput(console);
		
		// count words
		int count = 0;
		while(input.hasNext()) {
			String word = input.next();
			count++;
		}
	System.out.println("total words = " + count);
	
		
	}    
	// prompts the user for a file name;
	//creates and returns a Scanner tied to the file
	public static Scanner getInput(Scanner console)throws FileNotFoundException {
		System.out.print("input a file name?");
		File f = new File(console.nextLine());
		while(!f.canRead()) {
			System.out.println("file not found. Try again.");
			System.out.print("input a file name?");
			f = new File(console.nextLine());
			System.out.println(f);
		}
		// now we know that f is a file that can be read
		return new Scanner(f);
	}
}
