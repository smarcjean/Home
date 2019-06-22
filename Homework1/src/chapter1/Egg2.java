	package chapter1;
	
	// This program continues the egg program by adding more to it
	public class Egg2 {
		
		public static void main(String[] agrs) {
			
			drawBox1();      // methods call
			drawLine();
			drawBox2();
			drawHalf();
			drawBox3();
			
			
			
		}
		   // build the top of the egg
		public static void top() {
			System.out.println("  ________");
			System.out.println(" /        \\");
			System.out.println("/          \\");
			
		}  
		   // build the middle part
		public static void middle() {
			System.out.println("-\"-'-\" -'-\"-");
		}
		   // build the bottom part
		public static void bottom() {
			System.out.println("\\          /");
			System.out.println(" \\________/");
			
		} 
		    // draw box one
		public static void drawBox1() {
			top();
			bottom();
			System.out.println();
		}
		    // draw the line
		public static void drawLine() {
			middle();
		}
		    // draw box 2
		public static void drawBox2() {
			top();
			bottom();
			System.out.println();
		}
		    // draw the half part
		public static void drawHalf() {
			middle();
			bottom();
			
		}
		    // draw box 3
		public static void drawBox3() {
			top();
			middle();
			bottom();
		}
		
	}
