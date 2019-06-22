package soccer;

public class OddNumbersArray {

	public static void main(String[] args) {
		
	int[] list = { 1,2,3,4,5,6,7};
	
	printBackwards(list);
	}
	
	public static void printBackwards(int[] list) {
		if (list.length == 0) {
			System.out.println("[]");
		} else {
			System.out.print("[" + list[list.length - 1]);
			for (int i = list.length -2; i >= 0; i--) {
				System.out.print(", " + list[i]);
			}
			System.out.println("]");
		}
	}

}
