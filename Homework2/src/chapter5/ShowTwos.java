package chapter5;
// This program show the factors of 2 in a given integers.
public class ShowTwos {
	
	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
		
	}
	// write the factors of twos in a given number
	public static void showTwos(int number) {
		System.out.print(number + " = ");
		
		while (number % 2 == 0) {
			System.out.print(" 2 * ");
			number = number / 2;
			
		}
		System.out.println(number);
		
	}
}
