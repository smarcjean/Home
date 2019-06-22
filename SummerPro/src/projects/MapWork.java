package projects;
import java.util.*;
public class MapWork {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jenny", 7);
		map.put("Kenny", 9);
		map.put("Paul", 5);
		map.put("Laurie", 8);
		
		Collection<Integer> n = map.values();
		for (int d : n)
			System.out.println(d);
		
		
		
		
		Set<String> names = map.keySet();
		for (String a : names) {
			System.out.println(a);
		}
		
		for (String c : map.keySet()) {
			int m = map.get(c);
			System.out.println(c + " "+ m);
		}
		
		
	
	}

}
