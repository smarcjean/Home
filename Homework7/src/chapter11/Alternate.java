package chapter11;
import java.util.*;

public class Alternate {
	public static void main(String[] args) {
		int[] data1 = {1,2,3,4,5};
		int[] data2 = {6,7,8,9,10,11,12};
		
		List<Integer> list1 = new LinkedList<Integer>();
		
		for (int a : data1) {
			list1.add(a);
		}
		List<Integer> list2 = new LinkedList<Integer>();
		for (int b : data2) {
			list2.add(b);
		}
		
	List<Integer> two =	alternate(list1, list2);
	System.out.println(two);
		
	}
	
	public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
	    List<Integer> list = new LinkedList<Integer>();
	    int size1 = list1.size();
	    int size2 = list2.size();
	    int index1 = 0;
	    int index2 = 0;
	    boolean flag = true;

	    while(index1 < size1 || index2 < size2) {
	        if(index1 < size1 && flag) {
	            list.add(list1.get(index1));
	            index1++;
	        } else if(index2 < size2 && !flag) {
	            list.add(list2.get(index2));
	            index2++;
	        }
	        flag = !flag;
	    }
	 
	    return list;
	}
}
