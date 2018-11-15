package hangman2;

import java.io.*;
import java.util.*;
public class FileReading {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(users.text));
		int count = 0;
		while (input.hasNext()) {
			String word = input.next();
			count++;
					
		}
		System.out.println("total words = " + count);
		
	}
	
}