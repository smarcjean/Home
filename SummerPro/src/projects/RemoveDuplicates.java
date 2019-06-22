package projects;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {

	List<Integer> list = new LinkedList<Integer>();
	list.add(1);
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(5);
	list.add(5);
	list.add(5);
	list.add(7);
	list.add(7);
	list.add(11);
	
	countDuplicates(list);
	

	}
	
	public static void countDuplicates(List<Integer> list) {
		int count = 0;
		Iterator<Integer> itr = list.iterator();
		int previous = itr.next();
		System.out.println("pre " + previous);
		
		while (itr.hasNext()) {
			int next = itr.next();
			System.out.println(" next " + next);
			
			if (previous == next) {
				count++;
			}
			
			previous = next;
		}
		
		//System.out.println(count);
		
		
	}
	
	
	
	
	
	
}
