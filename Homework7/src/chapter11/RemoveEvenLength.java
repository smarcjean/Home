package chapter11;
import java.util.*;

// This program removes Strings of even length in the set
public class RemoveEvenLength {
	
	public static void main(String[] args) {
		String[] words = {"Long", "bow", "spear", "tennis", "ball"};
		Set<String> set = new HashSet<String>();
		for (String w : words) {
			set.add(w);
		}
		removeEvenLength(set);
		
	}
	// declare a method
	public static void removeEvenLength(Set<String> set) {
	    LinkedList<String> temp = new LinkedList<String>();

	    for(String str : set) {
	        if(str.length() % 2 == 1)
	            temp.add(str);
	    }

	    set.addAll(temp);
	    
	    System.out.println(temp);
	}

}
