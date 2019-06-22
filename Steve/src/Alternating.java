
// Alternate between two arrayList
import java.util.*;
public class Alternating {
	
	public static void main(String[] args) {
		int[] d1 = {1,2,3,4,5,6,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for (int d : d1)
			list1.add(d);
		
		int[] d2 = {8,9,10,11,12,13,14};
		
		List<Integer> list2 = new ArrayList<Integer>();
		for (int p : d2)
			list2.add(p);
		
		List<Integer> l = alternate(list1, list2);
		System.out.println(l);
	}
	
	public static List<Integer> alternate(List<Integer> list1, List<Integer> list2){
		List<Integer> list = new ArrayList<Integer>();
		int size1 = list1.size();
		int size2 = list2.size();
		int index1 = 0;
		int index2 = 0;
		
		boolean flag = true;
		
		while(index1 < size1 || index2 < size2) {
			if (index1 < size1 && flag) {
				list.add(list1.get(index1));
				index1++;
			} else if (index2 < size2 && !flag) {
				list.add(list2.get(index2));
				index2++;
			}
			flag = !flag;
		}
		
		return list;
	}

}
