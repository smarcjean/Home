package programs;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		int[] data = {4,5,0,9,7,5,10};
		int an = maxi(data);
		System.out.println("the max num is " + an);
		
	}
	public static int maxi(int[] num) {
		
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
}
