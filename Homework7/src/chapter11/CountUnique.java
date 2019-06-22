package chapter11;
import java.util.*;

public class CountUnique {
	public static void main(String[] args) {
		
		int[] data = {3,7,3,-1,2,3,7,2,15,15};
		
		List<Integer> list = new LinkedList<Integer>();
		for (int a : data) {
			list.add(a);
		}
		
		int b = countUnique(list);
		System.out.println(b);
	}
	
	public static int countUnique(List<Integer> list) {
	    Set<Integer> set = new HashSet<Integer>();

	    for(int n : list)
	        set.add(n);

	    return set.size();
	}

}
