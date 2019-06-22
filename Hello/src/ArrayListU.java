import java.util.ArrayList;
import java.util.Collections;

public class ArrayListU {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hi");
		list.add("Hey");
		list.add("dance");
		list.add("chicken");
		list.add("bale");
		list.add("keay");
		list.add("lovela");
		list.add("book");
		//for (int i = 0; i < list.size(); i++)
		//System.out.print(list.get(0)+ " ");
		//System.out.print(list.get(5)+ " ");
		
		list.set(0, "beep");
		//Collections.sort(list);
		for (String i: list)
		System.out.print(i+" ");
	}
}
