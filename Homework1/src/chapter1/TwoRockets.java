package chapter1;

// This program constructs two rockets side by side
public class TwoRockets {
	public static void main(String[] args) {
		
		drawTwoRockets();
		System.out.println();
		System.out.println();
		answer();
		
	}
		// construct the top 
	public static void top() {
		System.out.println("   /\\" + "  " +   "     /\\  "  );
		System.out.println("  /  \\" + "  " +  "   /  \\  ");
		System.out.println(" /    \\" + "  " + " /    \\ ");
	}  
	   // construct the box
	public static void box() {
		System.out.println("+------+"  + " " + "+------+");
		System.out.println("|      |"  + " " + "|      |");
		System.out.println("|      |"  + " " + "|      |");
		System.out.println("+------+"  + " " + "+------+");
	}
	   // construct the words in the box
	public static void wordBox() {
		System.out.println("|United|"  + " " + "|United|");
		System.out.println("|States|"  + " " + "|States|");
	} 
       // construct the two rockets
	public static void drawTwoRockets() {
		System.out.println();
		top();
		box();
		wordBox();
		box();
		top();
	}
	public static void answer() {
		System.out.println("The static method helps to reduce the amount of lines needed to ");
		System.out.println(" produce the rockets but it cannot eliminate the reproduction of the ");
		System.out.println(" two rockets side by side");
	}
	
}
