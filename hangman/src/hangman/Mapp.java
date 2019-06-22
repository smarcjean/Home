package hangman;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {
		Map<String, Double> salaryMap = new HashMap<String, Double>();
		salaryMap.put("Stuart Reges", 10000.00);
		salaryMap.put("Stuart Stepp", 95500.00);
		salaryMap.put("Jenny", 86753.09);
		
		Set<String> salaryN = salaryMap.keySet();
		for (String s : salaryN) {
			System.out.println(s);
			
	
		}
		
		Collection<Double> sal = salaryMap.values();
		for (double a : sal) {
			System.out.println(a);
			
		}
		
		for (String sale : salaryMap.keySet()) {
			System.out.println(sale + " " + sal);
		}
		
	}

}
