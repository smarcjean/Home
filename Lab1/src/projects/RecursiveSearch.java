package projects;

public class RecursiveSearch {
	public static void main(String[] args) {
		int[] a = {2,4,6,8,12,14,16,18};
		int d = search(a, 14, 2, 7);
		System.out.println(d);
		
		
	}
	
	public static int search(int[] a, int target, int left, int right) {
		if (left > right) {
			return -1;
		} else {
				int midpoint = (left + right) / 2;
			if (a[midpoint] == target)
				return midpoint;
			else if (a[midpoint] < target)
				return search(a, target,midpoint + 1, right);
			else
				return search (a, target, left, midpoint - 1);
			
			// location = search (a, x, 0, a.length - 1);
			
		}
	}

}
