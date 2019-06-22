
// This program does a linear search for a number x in an array
public class MaxMin {
	public static void main(String[] args) {
		// find a certain number x in an array
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22};
		
		int x = 21;
		int answer = search(array, x);
		
		if (answer == -1) {
			System.out.println("the element is not found in the array");
			
		} else {
			System.out.println("the element is found at index " + answer);
		}
		
	}
	public static int search(int[] num, int a) {
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == a) {
				return i;
			}
		}
		return -1;
	}
}
