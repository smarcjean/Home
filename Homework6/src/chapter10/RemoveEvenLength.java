package chapter10;

import java.util.ArrayList;

public class RemoveEvenLength {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Kate");
		list.add("Keyla");
		list.add("Bob");
		list.add("Jenny");
		list.add("Randa");
		
		removeEvenLength(list);
		
	}
	
	public static void removeEvenLength(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();
		int i;
		for ( i = 0; i <= list.size() - 1; i++) {
			  if(list.get(i).length() % 2 == 1)
		            temp.add(list.get(i));
		    }

		    list.clear();
		    list.addAll(temp);
		    
		    System.out.println(list);
		}
	}


