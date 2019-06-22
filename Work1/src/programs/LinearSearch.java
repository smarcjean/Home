package programs;

// Problem: Given an array arr[] of n elements, write a
// function to search a given element x in arr[].


/* Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1. */

public class LinearSearch {
	
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 80, 30, 60, 50, 
                110, 100, 130, 170};
		// x is the number to find in the array
     int x = 116;
     
     int answer = search(arr, x);
     System.out.println(answer);
     
	}
	
	public static int search(int[] arr, int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i; // i is the index
			}
		}
		return -1;
	}

}
