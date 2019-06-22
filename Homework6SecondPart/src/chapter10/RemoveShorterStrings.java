package chapter10;
import java.util.*;
public class RemoveShorterStrings {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("four");
		list.add("score");
		list.add("and");
		list.add("seven");
		list.add("years");
		list.add("ago");
		list.add("our");
		
		removeShorterStrings(list);
		
		
	}
			
		public static void removeShorterStrings(ArrayList<String> list){
		for(int i = 0; i < list.size() - 1; i++){
		if(list.get(i).length() <= (list.get(i + 1).length())){
		list.remove(i);
		} else{
			list.remove(i + 1);
	     }
	   }
		System.out.println(list);
	}

}
