// Will count the numbers that are common between the two Lists
import java.util.*;
public class MostCommon {

	public static void main(String[] args) {
		
		int[] d1 = {2,3,5,6,8,3,9,33};
		int[] d2 = {2,1,5,7,8,3,9,12};
		
		
		List<Integer> list1 = new LinkedList<Integer>();
		for (int d : d1)
			list1.add(d);
		
		List<Integer> list2 = new LinkedList<Integer>();
		for (int p : d2)
			list2.add(p);
		int l = mostCommon(list1, list2);
		System.out.println(l);
	}
	
	public static int mostCommon(List<Integer> list1, List<Integer> list2){
		Set<Integer> set1 = new HashSet(list1);
		Set<Integer> set2 = new HashSet(list2);
		
	int count = 0;
		for (int t : set2) {
			if (set1.contains(t)) {
				count++;
			}
			
		}
			
		return count;
	}
	

}
