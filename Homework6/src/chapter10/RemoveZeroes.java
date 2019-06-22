package chapter10;

import java.util.ArrayList;

public class RemoveZeroes  {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(0);
		
		removeZeroes(list);
		
	}
	
	public static void removeZeroes(ArrayList<Integer> arr) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) != 0) {
					temp.add(arr.get(i));
				}
				
			}
			
		
		arr.addAll(temp);
		System.out.println(temp);
	}

}
	


