package exams;
import java.io.File;


import java.io.FileNotFoundException;
import java.util.*;
//This is number 1
public class Concordance {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("Jane"));
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		int increment = 1;
		while (scan.hasNextLine()) {
			String next = scan.nextLine();
			if (!map.containsKey(next)) {
				map.put(next, increment);
				increment++;
			}
		}
		System.out.println(map);
	}

}
