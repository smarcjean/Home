package projects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InsertInOrder {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Alpha");
		list.add("Baker");
		list.add("Foxtrot");
		list.add("Tango");
		list.add("Whiskey");
		
		 insertInOrder(list, "Charlie");
	
	}
	
	public static void insertInOrder(List<String> list, String value){
	int position = 0;
	Iterator<String> itr = list.iterator();
	String previous = itr.next();
	
	while (itr.hasNext() && previous.compareTo(value) < 0) {
		previous = itr.next();
		position++;
	}
	
	list.add(position, value);
	
	System.out.println(list);
	}

}
