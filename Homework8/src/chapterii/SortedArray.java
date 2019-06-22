package chapterii;

import java.util.*;

/*Write a static method that builds a sorted array list from a
 *  randomly ordered array list. The method should throw an exception
 *   if the parameter's elements are not Comparable objects. Test the 
 *   method in a tester program.
 * 
 */

public class SortedArray {
	
	public static void sortedArray(List<Integer> list) {
		if (list== null) {
			throw new IllegalArgumentException();
		}
		Collections.sort(list);
		System.out.print(list);
		
	

}


	
}
