package chapter11;
import java.util.*;

public class MaxLength {
	public static void main(String[] args) {
		String[] words = {"Long", "bow", "spear", "tennis", "ball"};
		List<String> list = new LinkedList<String>();
		for (String w : words) {
			list.add(w);
		}
				
		Set<String> set = new HashSet<String>(list);
		
		int result = maxLength(set);
		System.out.println(result);
	}
	
	public static int maxLength(Set<String> set) {
	    int maxLength = 0;

	    for(String str : set) {
	        if(maxLength < str.length()) {
	            maxLength = str.length();
	        }
	    }

	    return maxLength;
	}

}
