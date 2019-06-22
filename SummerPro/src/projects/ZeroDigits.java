package projects;
import java.util.*;
public class ZeroDigits {

	public static void main(String[] args) {
		int[] data = {3, 4, 7, 2, 1, 8, 0,9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int a : data)
			list.add(a);
		int index = Collections.binarySearch(list, 7);
		//Collections.sort(list);
		System.out.println(index);
	 }
	
}


