package projects;
import java.util.*;
public class WrapHalf {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		*/
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		wrapHalf(list);

	}
	
	public static void wrapHalf(List<Integer> list) {
		int half = (list.size() + 1) / 2;
		for (int i = 0; i < half; i++) {
			int element = list.remove(list.size() - 1);
			list.add(0, element);
		}
		System.out.println(list);
	}

}
