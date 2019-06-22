package chapter10;

import java.util.ArrayList;

public class MarkLength4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("this");
		list.add("is");
		list.add("lots");
		list.add("of");
		list.add("fun");
		list.add("for");
		list.add("Java");
		list.add("coders");
		
		markLength4(list);
		
	}
	
	public static void markLength4(ArrayList<String> list) {
		 ArrayList<String> temp = new ArrayList<String>();

		    for(String str : list) {
		        if(str.length() == 4) {
		            temp.add("****");
		        }
		       temp.add(str);
		    }

		    list.clear();
		    list.addAll(temp);
		    
		    System.out.println(list);
		}
	}


