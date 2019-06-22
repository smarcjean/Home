package chapter7;

// This program accepts an array of integers as a parameter and 
//returns the percentage of the even numbers in the array as a real number.
public class PercentEven {
	
	public static void main(String[] args) {
		
		// declare an array of numbers
		int[] numbers = {6, 2, 9, 11, 3};
		double percentage;
		
		// a method call
		percentage = percentageEven(numbers);
		
		
		System.out.println("The percentage of even numbers is " + percentage);
			
		}
	
	// create the method for the percentage even numbers
	public static double percentageEven(int array[]) {
		
		// declare a percentage and a count variable
		double percentage = 0;
		double count = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				count++;
				
				// calculate the percentage
				percentage = (double) count / array.length * 100;
			}
		}
		return percentage;
	}

}
