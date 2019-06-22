package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplacementArrayList {

	public static void main(String[] args) {
		// shifting algo
		int[] data = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<Integer>();
		for (int a : data)
			list.add(a);
		
		 replacement(list, 5, 70);
		
	}
	
	public static void replacement(List<Integer> list, int target, int replacement) {
		for (int i = 0; i < list.size(); i++) {
			int index = list.indexOf(target);
			if (index >= 0) {
				list.set(index, replacement);
			}
		}
		System.out.println(list);
	}

}
