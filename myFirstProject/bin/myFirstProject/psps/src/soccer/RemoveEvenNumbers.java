package soccer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNumbers {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Scanner console = new Scanner(new File("Numbers"));
		
		
		while(console.hasNextInt()) {
			int n = console.nextInt();
			numbers.add(n);
			
		}
		System.out.println(numbers);
		removeEvenNumbers(numbers);
		System.out.println("The odd numbers are " + numbers);
	}
	
	public static void removeEvenNumbers(ArrayList<Integer> numbers) {
		for (int i = numbers.size() - 1; i >= 0; i--) {
			int n = numbers.get(i);
			if (n % 2 == 0) {
				numbers.remove(i);
			}
		}
	}
	

}
