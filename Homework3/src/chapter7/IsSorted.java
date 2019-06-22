package chapter7;

// This program accepts an array of integers, a minimum value, 
// and a maximum value as parameters and returns the count of
// how many elements from the array fall between the minimum and maximum (inclusive).
public class IsSorted {
	
	public static void main(String[] args) {
		

		double[] one = {16.1, 12.3, 22.2, 14.4}  ;
		double[] two = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
	boolean a , b;
	a = isSorted(two);
	
	b = isSorted(one);
	System.out.print("one\ttwo");
	System.out.println();
	System.out.print( b+"\t"+a);
		
	}
	// write the method that returns the result
	public static boolean isSorted(double[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			if (array[ i + 1] < array[i]) {
				return true;
			}
		}
		return false;
	}
}
