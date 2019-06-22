package soccer;
import java.util.*;

public class ArrayListPrep {
	public static void main(String[] args) {
		
	int[] data = {1,1,3,5,5,5,5,7,7,11};
	List<Integer> list = new LinkedList<Integer>();
	for (int a : data)
		list.add(a);
	int b = removeDuplicates(list);
	System.out.println(b);
			
		
	}
	public static int removeDuplicates(List<Integer> list) {
		int count = 0;
		Iterator<Integer> itr = list.iterator();
		int prev = itr.next();
		while (itr.hasNext()) {
			int next = itr.next();
			
			if (prev == next) {
				
				count++;
			}
			prev = next;
		}
		return count;
	}
	
	

}
