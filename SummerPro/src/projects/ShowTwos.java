package projects;

public class ShowTwos {

	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
		
		
	}
	
	public static void showTwos(int n) {
		int val = n;
		int count = 0;
		while ( val % 2 == 0) {
			count++;
			val /= 2;
		}
		System.out.print(n + " = ");
		
		for (int i = 0; i < count; i++) {
			System.out.print("2 * " );
		}
		System.out.println(val);
	}
}
