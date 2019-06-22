package chapter10;
import java.util.*;
public class FilterRange {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(7);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(6);
		list.add(7);
		
		int min = 5;
		int max = 7;
		
		filterRange(list, min, max);
	
	}
	
	public static void filterRange(ArrayList<Integer> list, int min, int max) {
	    ArrayList<Integer> temp = new ArrayList<Integer>();

	    for(int n : list) {
	        if(n < min || max < n)
	            temp.add(n);
	    }

	    list.clear();
	    list.addAll(temp);
	    System.out.println(temp);
	}

}
