package chapter11;
import java.util.*;

public class Partition {
	public static void main(String[] args) {
		
		int[] data = {15, 1, 6, 12,-3, 4, 8, 21, 2, 30, -1, 9};
		
		List<Integer> list = new ArrayList<Integer>();
		for (int a : data) 
			list.add(a);
			
		
		partition(list, 5);
		//System.out.println(list);
	}
	
	public static void partition(List<Integer> list, int val) {
		List<Integer> temp = new LinkedList<Integer>();
		List<Integer> temp1 = new LinkedList<Integer>();
		int count = 0;
		for (int i = list.size()-1 ; i >= 0; i--) {
			if ( list.get(i) < val ) {
				temp.add(list.get(i));
				count++;
				list.remove(list.get(i));
			
			} else if (list.get(i) > val) {
				temp1.add(list.get(i));
				count++;
				list.remove(i);
				
			}
			
		}
		
		for(int i = temp1.size() - 1; i >= 0; i--) {
			temp.add(temp1.get(i));
		}
		
		list.addAll(temp);
		System.out.println(list);
		
	}
	
	
	
}