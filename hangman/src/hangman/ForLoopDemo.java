package hangman;
import java.util.*;

public class ForLoopDemo {
	public static void main(String[] args) {
		
		int n = 1;
		while (n <= 5) {
			if (n == 3) {
				continue;
			}
			System.out.println(n);
			n++;
		}
	} 

}
