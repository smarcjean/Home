package exams;
import java.util.*;
public class StaticMethodTester {

	public static void main(String[] args) {
		
		List<Integer> data = new LinkedList<Integer>();
		Random ran = new Random();
		for (int i = 0; i <= 10; i++) {
			data.add(ran.nextInt(50));
			
		}
		StaticMethod.sortedArray(data);
		
	}

}
