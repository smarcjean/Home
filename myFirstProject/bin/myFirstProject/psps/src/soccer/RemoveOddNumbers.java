package soccer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOddNumbers {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// read from the file
		Scanner console = new Scanner(new File("Numbers"));
		
		// use a while loop to loop through the numbers
		while (console.hasNextInt()) {
			int n = console.nextInt();
			numbers.add(n);
		
		}
		
		System.out.println(numbers);
		
		removeOddNumbers(numbers);
		System.out.println("The even numbers are " + numbers);
	}
	
	public static void removeOddNumbers(ArrayList<Integer> numbers) {
		for (int i = numbers.size() - 1; i >= 0; i--) {
			int n = numbers.get(i);
			if (n % 2 != 0) {
				numbers.remove(i);
			}
		}
	}

}
