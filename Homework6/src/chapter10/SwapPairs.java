package chapter10;
import java.util.*;
public class SwapPairs {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("to");
		list.add("be");
		list.add("or");
		list.add("not");
		list.add("to");
		list.add("be");
		list.add("hamlet");
		
		
		
		swapPairs(list);
		
		
	}
	
	public static void swapPairs(ArrayList<String> list) {
		System.out.println();
		 for(int i = 0; i <= list.size() - 2; i += 2) {
		        String str = list.get(i + 1);
		        list.set(i + 1, list.get(i));
		        list.set(i, str);
		        System.out.println("\"" + list + "\"");
		    }
		// System.out.println("[\"" + list + "\"]");
		 
	}

}
