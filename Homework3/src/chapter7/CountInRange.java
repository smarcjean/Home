	package chapter7;
	
	
	// This program accepts an array of integers, a minimum value, and a
	// maximum value as parameters and returns the count of how many elements 
	// from the array fall between the minimum and maximum (inclusive).
	public class CountInRange {
		
	public static void main(String[] args) {
			// declaring the array and a count variable
			int[] values = { 14, 1, 22, 17, 36, 7, -43, 5};
			
			int count;
			
			// method call
			 count = countInRange(values, 4, 17);
			
			System.out.println("distance " +  count);
			
		}
		
		// write the method
	public static int countInRange(int array[], int min, int max) {
			int count = 0;
			
			for (int i = 0; i < array.length; i++) {
				if (min <= array[i] && max >= array[i]) {
					count++;
	  }
				
     	}	
			
			return count;
			
			
			
		}
		
	}	
			
			
		
	
