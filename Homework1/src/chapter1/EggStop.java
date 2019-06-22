package chapter1;
  // This program puts a stop sign inside the egg
public class EggStop {
	public static void main(String[] agrs) {
		
		eggOne();
		eggHalf();
		eggThree();
		eggFour();
	}
	  // make the top
	public static void top() {
		System.out.println("  _______");
		System.out.println(" /       \\");
		System.out.println("/         \\");
		
	}
	    // make a line with 7 dots
	public static void line7() {
		System.out.println(" +-------+");
	}
	   // draw a line with 9 dots
	public static void line9() {
		System.out.println("+---------+");
	} 
	    // make the middle part with the stop word
	public static void middle() {
		System.out.println("|   STOP  |");
	} 
	    // construct the bottom
	public static void bottom() {
		System.out.println("\\         /");
		System.out.println(" \\_______/");
		
	}
	  // draw first figure
	public static void eggOne() {
		top();
		bottom();
	}
	// draw second figure
	public static void eggHalf(){
	bottom();
	line7();
	}
	// draw third figure
	public static void eggThree() {
		top();
		middle();
		bottom();
	}
	// draw fourth figure
	public static void eggFour() {
		top();
		line9();
	}
}
