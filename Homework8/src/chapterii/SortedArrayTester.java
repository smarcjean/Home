package chapterii;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayTester {

	public static void main(String[] args) {

		int[] data = {5,7,3,9,1,6,8};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int d : data)
			list.add(d);
		
		
		SortedArray.sortedArray(list);
		
	}

}
