package soccer;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		/*
		// constructing an array
		String[] names = new String[5];
		
		// storing a value in an array
		names[0] = "Jessica";
		
		// retrieving a value from an array
		String s = names[0];
		
		System.out.print(s);
		*/
		
		
		
		// constructing an arraylist
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		// storing a value in an arrayList
		list.add("Jessica Bert");
		list.add("Prosky");
		list.add(0, "Kensky");
		list.remove(1);
		list.size();
		System.out.println(list.contains("Jessica"));
		System.out.println(list.isEmpty());
		
		ArrayList<String>  names = new ArrayList<String>();
		names.add("Janna");
		names.add("linda");
		names.add("kyle");
		names.addAll(list);
		
		for (String s: names)
		
			
			
			// another arraylist
	
		// retrieving a value from an arrayList
		
		// print it out
		System.out.println(s);
		System.out.println("size " + names.size());
	}

}
