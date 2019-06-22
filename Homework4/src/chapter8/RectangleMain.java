package chapter8;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 6, 8, 7);
		Rectangle rect2 = new Rectangle(5,6,8,9);
		
		//System.out.println( rect1.intersection(rect2));
		
		help(rect1.contains(8,9));
		help(rect2.contains(7,4));
		help(rect1.intersection(rect2));
		
	}
	public static void help(Object a) {
		System.out.println(a);
	}

}
