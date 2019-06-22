package chapter10;

import java.util.ArrayList;

public class MinToFront {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(8);
		list.add(92);
		list.add(4);
		list.add(2);
		list.add(17);
		list.add(9);
		
		minToFront(list);
		
	}
	
	public static void minToFront(ArrayList<Integer> arr) {	
		 int min = Integer.MAX_VALUE;
		    
		    for(int i = 0; i < arr.size(); i++) {
		        if(arr.get(i) < min) {
		            min = arr.get(i);
		           
		        }
		    }
		    
		    arr.add(0, min);
		    System.out.print( arr + " ");
	}
}
