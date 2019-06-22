package chapter7;
import java.util.*;
// This program accepts an array of integers and an integer value 
// as its parameters and returns the last index at which the value
// occurs in the array. The method should return -1 if the value is not found.
public class LastIndexOf {

	
	public static void main(String[] args) {
		
		// declare an array of numbers
		int[] numbers = { 74, 85, 102, 99, 101, 85, 56};
		int value;
		int index;
		
		Scanner console = new Scanner(System.in);
		System.out.print(" Enter a number to find its last index: ");
		 value = console.nextInt();
		
		 index = lastIndexOf(numbers, value);
		if (index == -1) {
			System.out.println( index);
		}else {
			System.out.println("The last index of the value " + value + " is " + index);
		}
		
	}
	// write a method
	public static int lastIndexOf(int array[], int value) {
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				index = i;
				
			}
		}
		return index;
		
		
	}
}
