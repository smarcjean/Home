package chapter7;

// This program returns the most frequently occurring element of an array of integers.

public class Mode {
	
	public static void main(String[] args) {
	
		// The array passed
		int[] values = {27, 15, 15, 11, 27};
		int answer;
		// method call
		answer = mode(values);
		System.out.println(answer);
		
		}
	
	// write a method that pass the array as a parameter and returns the mode
	public static int mode(int[] element) {
		
		int[] most = new int[101];
		for (int i = 0; i < element.length; i++) {
			most[element[i]]++;
		}
		int mode = 101;
		int count = 0;
		
		for (int i = 0; i < most.length; i++) {
			if (most[i] > count) {
				count = most[i];
				mode = i;
			}
		}
		return mode;
	}

}
