package chapter10;

import java.util.ArrayList;

public class DoubleList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("how");
		list.add( "are");
		list.add("you?");
		
		doubleList(list);
		
	}
	
	public static void doubleList(ArrayList<String> arr) {
		ArrayList<String> temp = new ArrayList<String>();
	    
	    for(String str : arr) {
	        temp.add(str);
	        temp.add(str);
	    }
	    
	    
	    System.out.println(temp);
	}

}
