package hangman;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String, Double> salaryMap = new HashMap<String, Double>();
		salaryMap.put("Stuart Reges", 10000.00);
		salaryMap.put("Stuart Stepp", 95500.00);
		salaryMap.put("Jenny", 86753.09);
		
		//double jensalary = salaryMap.get("Jenny");
		//System.out.printf("Jenny's salary is $%.2f\n", jensalary);
		
		// to see if a map contains a mapping key
		Scanner console = new Scanner(System.in);
		System.out.println("Type a person's name: ");
		String name = console.nextLine();
		// search the map for the given name
		if (salaryMap.containsKey(name)) {
			double salary = salaryMap.get(name);
			System.out.printf("%s's salary is $%.2f\n", name, salary);
			
		} else {
			System.out.println("I don't have a record for " + name);
		}
	}

}
