package projects;

public class MergeSort {
	public static void main(String[] args) {
		
		
		
	}
	
	public static void mergeSort(int[] a) {
		int[] copyBuffer = new int[a.length - 1];
		mergeSortHelper(a, copyBuffer, 0, a.length - 1);
	}
	
	public static void mergeSortHelper(int[] a, int[] copyBuffer, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSortHelper(a, copyBuffer, low, middle);
			mergeSortHelper(a, copyBuffer, middle + 1, high);
			//merge(a, copyBuffer, low, middle, high);
			
		}
	}

}
