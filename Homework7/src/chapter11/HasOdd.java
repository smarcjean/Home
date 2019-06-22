package chapter11;
import java.util.*;

// This program returns true if there is an odd number in the list and false otherwise
public class HasOdd {
	public static void main(String[] args) {
		int[] numbers = {1,4,6,8,2,12,16,18};
		
		Set<Integer> set = new HashSet<Integer>();
		for (int a : numbers) {
			set.add(a);
		}
		boolean a =  hasOdd(set);
		System.out.println(a);
		
	}
	
	// declare a method
	public static boolean hasOdd(Set<Integer> set) {
	    for(int n : set) {
	        if(n % 2 == 1)
	            return true;
	    }

	    return false;
	}

}
