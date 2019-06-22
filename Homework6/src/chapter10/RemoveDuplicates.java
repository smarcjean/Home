package chapter10;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("be");
		list.add("be");
		list.add("is");
		list.add("not");
		list.add("or");
		list.add("question");
		list.add("that");
		list.add("the");
		list.add("to");
		list.add("to");
		
		removeDuplicates(list);
		
	}
	
	public static void removeDuplicates(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();
		
		
		 for(int i = 0; i < list.size(); i++) {
		        if(temp.size() == 0 || !temp.get(temp.size() - 1).equals(list.get(i)))
		            temp.add(list.get(i));
		    }

		    list.clear();
		    list.addAll(temp);
		    System.out.println(temp);
		
	}

}
