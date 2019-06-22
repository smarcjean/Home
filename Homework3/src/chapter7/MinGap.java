package chapter7;

// This program accepts an integer array as a parameter and returns
//the minimum difference or gap between adjacent values in the array
// where the gap is defined as the later value minus the earlier value.
// if you are passed an array with fewer than two elements, return 0;
public class MinGap {

	public static void main(String[] args) {
		// declaring an array of numbers
		int[] array = {1, 3, 6, 7, 12};
		int min;
		// a method call
		min = minGap(array);
		System.out.println("The minimum gap is " + min);
	}
		
	// create the method that compute the gap between values.
	public static int minGap(int[] array) {
		
		// if the array has less than two elements return 0
	    if (array.length < 2) {
	        return 0;
	    } else {  // compute the gap as the first value minus the second value
	        int min = array[1] - array[0];
	        
	        for (int i = 1; i < array.length - 1; i++) {
	            int gap = array[i + 1] - array[i];  // second - first
	            if (gap < min) {
	                min = gap;
	            }
	        }
	        
	        return min;
	    }
}
}