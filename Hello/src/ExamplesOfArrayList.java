import java.util.ArrayList;

public class ExamplesOfArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(6);
		list.add(1);
		list.add(8);
		
		mystery1(list);
		
		
	}
	
	public static void mystery1(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) < list.get(i - 1)) {
				int element = list.get(i);
				list.remove(i);
				list.add(0, element);
			}
		}
		System.out.println(list);
		
	}
}
