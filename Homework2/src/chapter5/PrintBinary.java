package chapter5;

// This program accepts an integers as a parameter and returns a String of its binary representation.
public class PrintBinary {
	public static void main(String[] args) {
		toBinary(44);
		
	}
	// print the number's binary representation
	public static void toBinary(int number) {
		
		String binary = Integer.toBinaryString(number);
		
		System.out.println("The  binary representation of the number " + number+ " is " + binary);
				
	}
}
