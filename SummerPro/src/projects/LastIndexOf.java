package projects;

import java.util.Arrays;

public class LastIndexOf {

	public static void main(String[] args) {
		
		int[] data = {14, 1, 22, 17, 36, 7, -43, 5};
		Arrays.sort(data);
		
	int d = countInRange(data, 4, 17);
	System.out.println(d);
		
	}
	
	public static int countInRange(int[] list, int min, int max) {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= min && list[i] <= max) {
				count++;
				
			}
			
		}
		return count;
			 
	}

}
