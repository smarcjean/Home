package chapter10;

import java.util.ArrayList;

public class Stutter {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("how");
		list.add( "are");
		list.add("you?");
		
		int k = 4;
		stutter(list, k);
		
	}
	
	public static void stutter(ArrayList<String> list, int k) {
		ArrayList<String> temp = new ArrayList<String>();

	    for(String str : list) {
	        for(int i = 0; i < k; i++)
	            temp.add(str);
	    }
	    list.clear();
	    list.addAll(temp);
	    System.out.print(temp);
	}
	

}
