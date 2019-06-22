package projects;

import java.util.Scanner;

public class FileTesting {

	public static void main(String[] args) {
		Scanner scan = new Scanner("7 8 3 1 9");
		while (scan.hasNextInt()) {
		int next = scan.nextInt();
		System.out.println(next);
		}

	}

}
