package chapter11;
import java.util.*;

public class RemoveInRange {
	public static void main(String[] args) {
		
		int[] data = {0,0,2,0,4,0,6,0,8,0,10,0,12,0,14,0,16};
		
		List<Integer> list = new LinkedList<Integer>();
		for (int a : data) {
			list.add(a);
			
		}
		
		removeInRange(list,0,5,13);
	}
	
	public static void removeInRange(List<Integer> list, int val, int start, int end) {
	    if(start > end)
	        return;

	    List<Integer> temp = new LinkedList<Integer>();

	    for(int i = 0; i < start; i++)
	        temp.add(list.get(i));

	    for(int i = start; i < end; i++) {
	        if(list.get(i) != val)
	            temp.add(list.get(i));
	    }

	    for(int i = end; i < list.size(); i++)
	        temp.add(list.get(i));

	    list.addAll(temp);
	    System.out.println(temp);
	    
	}

}
