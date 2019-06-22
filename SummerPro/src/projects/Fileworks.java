package projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileworks {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Top");
		
		Scanner sc = new Scanner(file);
	
		process(sc);
	}
	
	public static void process(Scanner sc) {
		while (sc.hasNext()) {
			String name =  sc.next();
			
			double sum = 0.0;
			while (sc.hasNextDouble()) {
				sum += sc.nextDouble();
			}
			System.out.println("total hours worked by " + name + " = " + sum);
		}
		
		
	}

}
