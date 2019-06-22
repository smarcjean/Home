package chapter7;

// This program accepts an array of integers as its parameter and 
//returns the median of the numbers in the array. 
public class Median {
	
	public static void main(String[] args) {
		
		int[] numbers = { 5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
		
		int median;
		
		median = median(numbers);
		
		System.out.println("The median of the array is " + median);
		
	}
	
	// write the median method to compute and find the middle number
	public static int median(int array[]) {
		
		for (int i = 0; i < array.length - 1; i++) {
			int med = i;
			//System.out.print("med " + med + " ");
		//	System.out.println();
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[med]) {
					med = j;
					System.out.print( "med " + med + " ");
					
				}
			}
			int numbers = array[i];
			array[i] = array[med];
			array[med] = numbers;
		}
		return array[array.length / 2];
		
	}
}
