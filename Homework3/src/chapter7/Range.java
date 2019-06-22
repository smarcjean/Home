package chapter7;

// This program returns the range of values in an array of integers.
public class Range {
	
	public static void main(String[] args) {
		// declaring an array 
		int[] list = { 36, 12,  25, 19, 46, 31, 22};
		int count;
		
		count = range(list);
		
		System.out.println(count);
		
	}
	public static int range(int array[]) {
		int max = array[0];
		int min = array[0];
		
		int range;
		
		for (int i = 0; i < array.length; i++ ) {
			if (array[i] > max) {
				max = array[i];
			} 
			if (array[i] < min)	{
				min = array[i];
			}
		}
		return range = max - min + 1;
	}
}
