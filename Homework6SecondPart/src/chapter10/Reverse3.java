package chapter10;
import java.util.*;
public class Reverse3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(8);
		list.add(19);
		list.add(42);
		list.add(7);
		list.add(26);
		list.add(19);
		list.add(-8);
		
		reverse3(list);
		
	}
	
	public static void reverse3(ArrayList list){
		for(int i = 0; i < list.size() - 2; i += 3){
			
			int temp1 = (int) list.get(i);
			int temp2 = (int) list.get(i + 2);
			list.set(i, temp2);
			list.set(i + 2, temp1);
		}
		System.out.println(list);
	}

}
