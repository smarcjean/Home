package projects;

import java.util.*;
import java.io.*;
public class LineBased {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Line"));
		process(scan);
		
	}
	
	public static void process(Scanner scan) {
		while (scan.hasNextLine()) {
			String next = scan.nextLine();
			System.out.println(next.toUpperCase());
		}
		
	}

}
