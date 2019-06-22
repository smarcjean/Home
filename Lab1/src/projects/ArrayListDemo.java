package projects;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList(20);
	
	names.add("Abigail");
	display(names);
	names.add("Brian");
	display(names);
	names.add("Zachary");
	display(names);
	names.add("Christy");
	names.add("James");
	display(names);
	names.remove(1);
	display(names);
	names.set(0, "Annette");
	display(names);
	}
	
	public static void display(ArrayList<String> names) {
		System.out.println("\nThe size of the list is " + names.size());
		for (int x = 0; x < names.size(); ++x) {
			System.out.println("position " + x + " Name: " + names.get(x));
		}
	}
}
