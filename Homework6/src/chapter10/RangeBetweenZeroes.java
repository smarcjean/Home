package chapter10;

import java.util.ArrayList;

public class RangeBetweenZeroes {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(0);
		list.add(9);
		list.add(0);
		list.add(6);
		list.add(4);
		list.add(8);
		
		int answer = rangeBetweenZeroes(list);
					System.out.println(answer);
	}
	
	public static int rangeBetweenZeroes(ArrayList<Integer> list) {
		
		boolean found = false;
		int minIndex = 0;
		int maxIndex = 0;
				
		for(int i = 0; i < list.size(); i++){	
			if(list.get(i) == 0 && !found){
				found = true;
				minIndex = i;
			}
			
			if(list.get(i) == 0 && found){
				maxIndex = i;
			}
		}
		
		if(found)
			return (maxIndex - minIndex + 1);
		else
			return 0;
	}
		
	}

