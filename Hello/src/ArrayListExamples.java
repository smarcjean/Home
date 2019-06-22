import java.util.*;
public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(5);
		list.add(2);
		list.add(9);
		list.add(7);
		
	
		// find the max
		int r = max(list);
		System.out.println(r);
		
	}
	
	public static int max(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

}
