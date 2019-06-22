		package chapter1;
		
		// This program make lanterns
		public class Lanterns {
		public static void main(String[] args) {
			
			lanternOne();
			lanternTwo();
			lanternThree();
				
		}
		   // part one
		public static void fiveStars() {
				System.out.println("    *****");
		}
		   // part two
		public static void nineStars() {
			System.out.println("  *********");
		}
		    // part three
		public static void moreStars() {
			System.out.println("*************");
		}
		   // part four
		public static void bars() {
			System.out.println("* | | | | | *");
		}
		    // first lantern
		public static void lanternOne() {
			System.out.println();
			fiveStars();
			nineStars();
			moreStars();
			
		}
		    // second lantern
		public static void lanternTwo() {
			lanternOne();
			bars();
			moreStars();
			fiveStars();
			nineStars();
			moreStars();
			
			
		}
		    // third lantern
		public static void lanternThree() {
			lanternOne();
			fiveStars();
			bars();
			bars();
			fiveStars();
			fiveStars();
		}
		}
