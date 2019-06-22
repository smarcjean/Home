package chapter7;


//This program returns the standard deviation of an array of integers.
//By taking the square root of the sum of the squares of the differences
//between each element and the mean, divided by one less than the number of elements.

public class Stdev {
	public static void main(String[] args) {
		
		int[] values = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		double sd;
		
		// method call
		sd = stdev(values);
		System.out.printf("There Standard deviation is %.3f ", sd);
		
		
	}
	
	// write a method to do the computation
	public static double stdev(int[] array) {
		// declare some variable to hold the results
		double mean = 0;
	    int sum = 0;
	    
	    for (int i = 0; i < array.length; i++) {
	        sum += array[i];
	    }
	    
	    double average = (double)sum / array.length;
	   
	    
	    for (int i = 0; i < array.length; i++) {
	        mean += Math.pow(array[i] - average, 2);
	    }
	    
	    return Math.sqrt(mean / (array.length - 1));
	}
}
