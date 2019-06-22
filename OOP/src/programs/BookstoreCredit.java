package programs;

import java.util.*;

public class BookstoreCredit {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String name;
		double grade;
		
		System.out.println("Enter your name");
		name = kb.next();
		System.out.println("Enter your grade");
		grade = kb.nextDouble();
		displayStudentsCredit(name, grade);
		
		
	}
	
	public static void displayStudentsCredit(String a, double b) {
		final int POINT = 10;
		int credits = (int) (b * POINT);
		
		System.out.println("Your Book store credit is $" + credits);
		
	}

}
