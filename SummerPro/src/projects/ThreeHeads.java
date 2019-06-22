package projects;
import java.util.*;
public class ThreeHeads {

	public static void main(String[] args) {
		
		threeHeads();
	}
	
	public static void threeHeads() {
		Random ran = new Random();
		int count = 0;
		while (count < 3) {
			boolean head = ran.nextBoolean();
			
			if (head) {
				System.out.println("H");
				count++;
			} else {
				System.out.println("T");
				count = 0;
			}
		}
	}

}
