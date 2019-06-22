package hangman;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("how");
		list.add( "are");
		list.add("you?");
		
		for (String a : list) {
			System.out.println(a);
		}
	}

}
