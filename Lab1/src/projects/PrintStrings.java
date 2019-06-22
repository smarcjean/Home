package projects;
import java.util.*;
public class PrintStrings {
	public static void main(String[] args) {
		
		System.out.println("Enter a number and then a word ");
		Scanner console = new Scanner(System.in);
		printStrings(console);
		
		
	}
	
		public static void printStrings(Scanner input) {
			while (input.hasNextInt()) {
				int num = input.nextInt();
				if (input.hasNext()) {
					String word = input.next();
					System.out.println(padLine(word, num));
				} else {
					return;
				}
			}
		}

		private static String padLine(String word, int repeat) {
			StringBuilder b = new StringBuilder();
			for (int i = 0; i < repeat; i++) {
				b.append(word);
			}
			return b.toString();
		}

		
	}


