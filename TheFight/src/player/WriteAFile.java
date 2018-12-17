package player;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteAFile {
	
public static void main(String[] args) throws FileNotFoundException {
		
		
		PrintStream output = new PrintStream(new File("QuestionsLoader.txt"));
		output.println("Who is the president of the the United States: Donald Trump");
		output.println("What is the biggest shopping store online: Amazon");
		output.println("How many planets are there?: Seven");
		output.println("What language they speak in Mexico: Spanish");
		output.println("In what continent is Spain?: Europe");
	}

}
