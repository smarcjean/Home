package programs;

import java.util.Arrays;
import java.util.Scanner;

public class One {
	
	String name;
	int age;
	String language;
	

	public static void main(String[] args) {
		
		int[] data = {74, 85, 102, 99, 101, 85, 56};
		int index;
		int value;
		
		
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("What is the number: ");
		value = console.nextInt();
		
		index = lastIndexOf(data, value);
		
		if (index == -1) {
			System.out.println("number not found");
			
		} else {
			System.out.println("The last index of " + value + " is " + index);
		}
		
		 }
		
		 public static int lastIndexOf(int[] a, int c) {
			 int index = -1;
			 for (int i = 0; i < a.length - 1; i++) {
				 if (a[i] == c) {
					 index = i;
					 
				 }
				
			 }
			return index;
			 
		 }
	}
	

