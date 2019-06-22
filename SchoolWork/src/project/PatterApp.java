package project;

import java.util.Arrays;

public class PatterApp {
	public static void main(String[] args) {
	int[] list = {1,2,3,4,5,6,7};
	
	shifting(list);

	}
	
	public static  void shifting(int[] list) {
		int last = list.length - 2;
		for (int i = list.length ; i >= 0; i--) {
			list[i] = list[i + 1];
		}
		list[0] = last;
		System.out.println(last);
	}

}
