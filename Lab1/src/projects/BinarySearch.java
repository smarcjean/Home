package projects;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a = {2,4,6,8,12,14,16,18};
		int d = search(a, 14);
		System.out.println(d);
		
	}
	
	public static int search(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int midpoint = (left + right) / 2;
			if (a[midpoint] == target)
				return midpoint;
			else if (a[midpoint] < target)
				left = midpoint + 1;
			else 
				right = midpoint - 1;
		}
		return -1;
		
		// location = search(a, x);
	}

}
