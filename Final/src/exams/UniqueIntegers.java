package exams;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// This is number 5
public class UniqueIntegers {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter file name ");
		String name = scan.nextLine();
		
		
		Scanner console = new Scanner(new File(name));
		Set<Integer> set = new HashSet<Integer>();
		
		while (console.hasNextInt()) {
			int next = console.nextInt();
			set.add(next);
			System.out.println();
			
		}
		
		System.out.println("The unique integers are: " + set);
	}

}
