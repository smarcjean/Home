package chapter7;

// This program accepts an integer k and an array a as its parameters
// and returns the element such that k elements have greater or equal value.
// if k = 0; return the largest element, if k = 1; return the second-largest element
// and so on.
public class KthLargest {
	
	public static void main(String[] args) {
		
		// declaring the array a and variable k
		int[] a = {74, 85, 102, 99, 101, 56, 84};
		int k = 2;
		int largest;
		
		// the method call
		largest = kthLargest(a, k);
		
		System.out.println("The third largest value in the array is " + largest);
		// sorting the elements in the arrays
		for (int i = 0; i < a.length; i++) {
			if (a[i] + " " != null ) {
				System.out.println(a[i]);
			}
		}
		
	}
	
	// creating a method
	public static int kthLargest(int a[], int k) {
		
		for (int i = 0; i < a.length - 1; i++) {
			int b = i;
			
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[b]) {
					b = j;
				}
			}
			int el = a[i];
			a[i] = a[b];
			a[b] = el;
		}
		return a[a.length - k - 1];
		
		
		
	}
}
