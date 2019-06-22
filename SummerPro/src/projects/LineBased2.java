package projects;
import java.util.*;
import java.io.*;

// This program finds the total of hours worked by each employee and their id


public class LineBased2 {
	
	// use a combination of line-based and token-based process
	// use a String to read token by token the data
	// use a line-based process to read the overall data
	// and use a mini-scanner to read each section of the data token by token
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File ("Top2"));
		while (scan.hasNextLine()) {
			String next = scan.nextLine();
			processLine(next);
		}
	
	}
	
	public static void processLine(String text) {
		Scanner data = new Scanner(text);
		int id = data.nextInt();
		String name = data.next();
		
		double sum = 0.0;
		while (data.hasNextDouble()) {
			sum += data.nextDouble();
		}
		System.out.println("Total hours worked by " + name + " " + id + " " + " = " + sum);
	}

}
