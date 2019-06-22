package work;
import java.util.*;

public class RemoveZeroes {
	public static void main(String[] args) {
		int[] data1 = {1,3,8,0,19,24,0,7,2,0};
		test(data1);
		
		int[] data2 = {7,3,0,4,6,0,0,13,0,78,0,0,19};
		test(data2);
		
		int[] data3 = {1,2,3,4,5};
		test(data3);
		
		int[] data4 = {1,0,2,0,0,3,0,0,0,4,0,0,0,0};
		test(data4);
		
		int[] data5 = {0,0,8,3,0,0,4,0,0,7,2,0,0,18};
		test(data5);
		
		int[] data6 = {0,0,0,0};
		test(data6);
		
		int[] data7 = {0};
		test(data7);
		
		int[] data8 = {};
		test(data8);
	}
	
	
	public static void test(int[] data) {
		for (int i : data) {
			
		}
		System.out.println(" before " + Arrays.toString(data));
		removeZeroes(data);
		System.out.println(" after " + Arrays.toString(data));
		System.out.println();
		
		
	}
		public static void removeZeroes(int[] data) {
			int[] temp = new int[data.length];
			int count = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] != 0) {
					temp[count] = data[i];
					count++;
				}
				
				
			}
				for (int i = 0; i < temp.length; i++) {
					data[i] = temp[i];
				
			}
		
	}
	
	
	
	
	
	
	
	
	

}
