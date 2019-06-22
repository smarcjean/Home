package chapter11;
import java.util.*;

public class CountCommon {
	public static void main(String[] args) {
		/*int[] data1 = {3,7,3,-1,2,3,7,2,15,15};
		int[] data2 = {-5,15,2,-1,7,15,36};
		*/
		
		int[] data1 = {2,3,5,6,8,3,9,33};
		int[] data2 = {2,1,5,7,8,3,9,12};
		List<Integer> list1 = new LinkedList<Integer>();
		for (int a : data1) {
			list1.add(a);
		}
		List<Integer> list2 = new LinkedList<Integer>();
		for (int b : data2) {
			list2.add(b);
		}
		
		int result = countCommon(list1, list2);
		System.out.println(result);
	}
	
	public static int countCommon(List<Integer> list1, List<Integer> list2) {
	    Set<Integer> set1 = new HashSet<Integer>(list1);
	    Set<Integer> set2 = new HashSet<Integer>(list2);
	    int count = 0;

	    for(int n : set2) {
	        if(set1.contains(n))
	            count++;
	    }

	    return count;
	}

}
