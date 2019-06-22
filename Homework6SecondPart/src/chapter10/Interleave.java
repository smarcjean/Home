package chapter10;
import java.util.*;

public class Interleave {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		
		interleave(a1, a2);
	}
	
	public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	    int times = Math.min(a1.size(), a2.size());
	    int i;
	    
	    for (i = 0; i < times; i++) {
	        int num = a2.get(i);
	        a1.add(2 * i + 1, num);
	    }
	    
	    if (i < a2.size()) {
	        for (int j = i; j < a2.size(); j++) {
	            a1.add(a2.get(j));
	        }
	    }
	   System.out.println(a1);
	}
	
}
