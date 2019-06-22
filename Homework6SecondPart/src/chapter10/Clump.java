package chapter10;
import java.util.*;
public class Clump {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("four");
		list.add("score");
		list.add("and");
		list.add("seven");
		list.add("years");
		list.add("ago");
		list.add("our");
		
		clump(list);
		
	}
	
	public static void clump(ArrayList<String> list) {
		String singleString = null;
		for(int i = 0; i < list.size() -1; i++) {
			singleString = "(" + list.get(i) + " "
					+ list.get(i + 1) + ")";

			list.set(i , singleString);
			list.remove(i + 1 );
			list.get(list.size()-1);
			
			//System.out.print(" " + singleString + list);
		}
		System.out.print(" " + singleString + list);
	}

}
