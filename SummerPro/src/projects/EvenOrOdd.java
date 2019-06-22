package projects;
import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What color do you want? ");
		String color = scan.nextLine();
		
		if (color.equalsIgnoreCase("B")) {
			System.out.println("you have chosen Blue");
		} else if (color.equalsIgnoreCase("G")) {
			System.out.println("you have chosen Green");
		} else if (color.equalsIgnoreCase("R")) {
			System.out.println("you have chosen Red");
		} else {
			System.out.println("unknown color: " + color);
		}
		
	}

}
