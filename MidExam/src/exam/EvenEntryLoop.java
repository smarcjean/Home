package exam;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EvenEntryLoop {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int evenNumber;
		int stopper = 999;
		int number = 0;
		
		System.out.print("Enter an even number");
		evenNumber = console.nextInt();
		
		
		while (evenNumber != 999) {
			if (number % 2 == 0) {
				System.out.println("Good job!");
				System.out.print("Enter an other even number");
				number = console.nextInt();
			}
			if (number % 2 != 0) {
				//System.out.println("Not an even number");
		}
		System.out.println("Enter an even number");
		number = console.nextInt();
	}

	}
	public void display() {
		JOptionPane.showMessageDialog(null, "Not an even number");
		
	}
}
