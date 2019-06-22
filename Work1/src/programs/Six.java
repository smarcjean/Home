package programs;

public class Six {
	public static void main(String[] args) {
		
		printsquares(3,7);
		
	}
	public static void printsquares(int min, int max) {
		for (int i = min; i <= max ; i++) {
			int k = i;
			for (int j = min; j <= max; j++) {
				System.out.print(k);
				k = k == max? min: k+1;
			}
			System.out.println();
		}
		
		
	}

}
