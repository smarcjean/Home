package programs;

public class BinarySearch2 {
	
	public static void main(String[] args) {
		int[] num = { 10, 20, 50, 70, 30};
		
		int i = num[0];
		int j = num.length;
		int x = 30;
		
		
		int answer = binarySearch(num, x, i, j);
			System.out.println(answer);
	}
	
	public static int binarySearch(int[] arr, int x, int i, int j) {
		int mid = (i + j) / 2;
		while (i <= j) {
			if (x > arr[mid]) {
				i = mid + 1;
				
			} else {
				i = mid;
			}
			if (x == arr[i]) {
				i = i;
			} else {
				 i= 0;
			}
		}
		return j;
	}

}
