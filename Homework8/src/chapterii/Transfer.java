package chapterii;
//  Write the code that transfers the elements from the list1
//to the list list2. The elements in list2 should be in the reverse 
//order from their original positions in list1.
import java.util.*;
public class Transfer {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		
		transfers(list1);
	}
	
	public static void transfers(List<Integer> list) {
		List<Integer> list2 = new ArrayList<Integer>();
		for(int d : list) {
			list2.add(d);
			//System.out.print(list2);
		}
		
		for (int i = list2.size() - 1; i >= 0; i--) {
			System.out.print(list2.get(i ) + " ");
		}
	}

}
