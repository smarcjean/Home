package work;
import java.util.*;

public class ArrayListRemoving2 {
public static void main(String[] args) {
		
		// declare an array
		String[] data1 = {"a", "b", "c", "a", "b", "c", "a", "b", "c",};
		test(data1, "a");
		test(data1, "c");
		test(data1, "b");
		
		String[] data2 = {"a", "a", "a", "a", "a"};
		test(data2, "a");
		test(data2, "b");
		
		String[] data3 = {};
		test(data3, "a");
	}
	
	// declare a method
	public static void test(String[] data, String target) {
		
		ArrayList<String> list = new ArrayList<String>();
		for (String word : data) {
			list.add(word);
		
		}
		
		System.out.println(" Testing " + list);
		System.out.println(" removing " + target);
		removeAll(list, target);
		System.out.println(" result " + list);
		System.out.println();
	}
	
	public static void removeAll(ArrayList<String> list, String target) {
		for (int i = list.size() -1; i >= 0; i--) {
			if (list.get(i).equals(target)) {
				list.remove(i);
			}
		}
	}



}
