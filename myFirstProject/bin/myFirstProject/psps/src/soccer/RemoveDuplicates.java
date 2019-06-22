package soccer;
import java.io.*;
import java.util.*;

// This program removes duplicates names or names that repeat
public class RemoveDuplicates {
	public static void main(String[] args) throws FileNotFoundException {
		// create a Scanner object to read from the file
		Scanner console = new Scanner(new File("Names"));
		
		// create an ArrayList to store the names 
		ArrayList<String> list = new ArrayList<String>();
		
		// use a while loop to go through the names and eliminate names that repeat
		while(console.hasNext()) {
			String names = console.next();
			if(!list.contains(names)) { // if the list does not have it, add it
				list.add(names); // add the names to the list
			}
			
		}
		System.out.print(list+" "); // print the names to the console
	}

}
