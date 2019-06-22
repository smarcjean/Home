package chapter11;

import java.util.Arrays;

public class TryingOut {

	public static void main(String[] args) {
		
		int[] list = {5,8,6,2,9,1,3,7};
		
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j + 1]);
				int temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				sorting(list);
			}
		}
		
		
	}
	
	public static void sorting(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			//System.out.print(list[i] + " ");
		}
		System.out.println(Arrays.toString(list));
	}

}
