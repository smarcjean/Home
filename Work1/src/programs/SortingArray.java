package programs;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] num = { 9, 6, 4,21, 6, 3, 7};
		int a, b, temp;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j +1];
					num[j + 1] = temp;
					
					sort(num);
				}
			}
		
		}
		
	}
	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {
			//System.out.print(" " + arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
