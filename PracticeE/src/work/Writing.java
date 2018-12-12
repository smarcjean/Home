package work;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;

public class Writing {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		PrintStream output = new PrintStream(new File("HangmanTheGames.txt"));
		output.println("cat: the word says meow");
		output.println("dog:the word says woof");
		output.println("fish: the word says blub");
		output.println("giraffe: the word has a long neck");
		output.println("coding: the word is something you do one computer");
	}

}
