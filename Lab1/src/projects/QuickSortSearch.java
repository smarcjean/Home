package projects;

public class QuickSortSearch {
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,12,14,16,18};
		
		
		
		
	}
	
	public static void quickSort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right;
		int pivotValue = a[(left + right) / 2];
		while (i < j) {
			while (a[i] < pivotValue) i++;
			while (pivotValue < a[j]) j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		quickSort(a,left, j);
		quickSort(a, i, right);
		System.out.println();
	}

}
