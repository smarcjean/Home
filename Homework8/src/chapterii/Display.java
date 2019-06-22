package chapterii;
// Write the code that displays all of the elements in a set s 
//in the terminal window.
import java.util.*;
public class Display {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		for (int e : s)
			System.out.println(e);
		
		
	}

}
