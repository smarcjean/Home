package work;
import java.util.*;

public class SplitArrayList {
	public static void main(String[] args) {
		int[] data1 = {2, 4, 6, 8};
		test(data1);
		
		int[] data2 = {3, 5, 7};
		test(data2);
		
		int[] data3 = {18, 7, 4, 24, 11};
		test(data3);
		
		int[] data4 = {-8, 0, -3, 2001};
		test(data4);
		
		int[] data5 = {42};
		test(data5);
		
		int[] data6 = {17};
		test(data6);
		
		int[] data7 = {};
		test(data7);
	}

	public static void test(int[] data) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int n : data) {
			list.add(n);
		}
		
		System.out.println(" spliting " + list);
		split(list);
		System.out.println(" after " + list);
		System.out.println();
	}
	
	public static void split(ArrayList<Integer> list) {
		for (int i =list.size() -1; i>=0; i--) { // or a normal loop with i += 2;
			int n = list.get(i);
			list.set(i, n / 2 + n % 2); // it will add the mod or remainder on i
			list.add(i + 1, n / 2);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
