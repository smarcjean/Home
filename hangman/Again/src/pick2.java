import java.util.*;
public class pick2 {
	
	public static void main(String[] args) {
	
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j<= (line - 1); j++) {
		
		// without this print command it will draw a upside down triangle
				System.out.print(" ");
			}
		

		for (int i = 1; i <= (11 - 2 * line); i++) {
			System.out.print("*");
		}
		
		System.out.println();	
		
		}	
		
		
	}

}
