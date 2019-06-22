package work;

import java.util.Arrays;

public class ReplacementAlgo {

	public static void main(String[] args) {
	
	int[] data = {1,2,3,4,5,6,7};
	
	 replacement(data,5, 22);
	
	
	}
	
	public static void replacement(int[] data, int target, int replace) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				data[i]= replace;
			}
		}
		for (int i = 0; i < data.length; i++)
		System.out.print(data[i] + " ");
	}

}
