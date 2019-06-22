package projects;
import java.io.*;
import java.util.*;

public class FrequentFlier {
public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("Fliers"));
		int answer = frequentFlier(input);
		System.out.print(answer);
	}


	public static int frequentFlier(Scanner input) {
	
		int sum = 0;
		
		while (input.hasNext()) {
			String name = input.next();
			int miles = input.nextInt();
			
			if (name.equalsIgnoreCase("firstclass")) {
				sum += 2 * miles;
			}
			
			if (name.equalsIgnoreCase("coach")) {
				sum += miles;
			}
			 
			if (name.equalsIgnoreCase("discount")) {
				sum += 0 * miles;
			}
		}
			
		return sum;
		
	}

}
