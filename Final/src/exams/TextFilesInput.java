package exams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
// This is number 7
public class TextFilesInput {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.print("The input file name ");
		String input = scan.nextLine();
		
		System.out.print("The output file name ");
		String output = scan.nextLine();
		
		Scanner key = new Scanner(new File(input));
		List<String> list = new LinkedList<String>();
		
		
		while (key.hasNextLine()) {
			String next = key.nextLine().toUpperCase();
			list.add(next);
		}
		
		PrintStream out = new PrintStream(new File(output));
		out.println(list);
		
		
	}
	
}
