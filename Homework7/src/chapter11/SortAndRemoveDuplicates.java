package chapter11;
import java.util.*;

public class SortAndRemoveDuplicates {
	public static void main(String[] args) {
		int[] data = {7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int a : data) {
			list.add(a);
		}
		
		Collections.sort(list);
		
		sortAndRemoveDuplicates(list);
	}
	
	public static void sortAndRemoveDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new TreeSet<Integer>(list);
		for (int a : list) {
			set.add(a);
		}
		System.out.println(set);
	}

}
