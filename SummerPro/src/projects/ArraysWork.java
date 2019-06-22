package projects;
import java.util.*;

// find the inversions of each number
// an inversion is a pair of numbers and the first is bigger the second
public class ArraysWork {

	public static void main(String[] args) {
		int[] data = { 3, 1, 4, 2};
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
				System.out.println("(" + data[i] + ", " + data[j] + ")");
				}
			}
			//System.out.println(data[i]);
		}
	}

}
