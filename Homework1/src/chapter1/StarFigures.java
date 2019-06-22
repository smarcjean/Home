package chapter1;
   // This program produces shapes with stars
public class StarFigures {
	
	public static void main(String[] agrs) {
		
		System.out.println();
		firstShape();
		System.out.println();
		secondShape();
		System.out.println();
		thirdShape();
		
	}
	    // produces a line of 5 stars
	public static void twoLines() {
		System.out.println("*****");
	}
	   // produces 2 stars
	public static void twoStars() {
		System.out.println(" * *");
		
	}
	   // produces one star
	public static void oneStar() {
		System.out.println("  *");
	}
	  // first shape
	public static void firstShape() {
		twoLines();
		twoLines();
		twoStars();
		oneStar();
		twoStars();
	}
	   // second shape
	public static void secondShape() {
		twoLines();
		twoLines();
		twoStars();
		oneStar();
		twoStars();
		twoLines();
		twoLines();
	}
	    // third shape
	public static void thirdShape() {
		oneStar();
		oneStar();
		oneStar();
		twoLines();
		twoLines();
		twoStars();
		oneStar();
		twoStars();
		
	}
}
