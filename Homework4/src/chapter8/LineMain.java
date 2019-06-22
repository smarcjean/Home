package chapter8;

public class LineMain {
	public static void main(String[] args) {
		Line line1 = new Line(4, 6, 3, 7);
		Line line2 = new Line(7,9,3,2);
		Point p1 = new Point();
		Point p2 = new Point();
		
		
		
		
		
		System.out.println(" p1 is "+ p1.isCollinear(p2, p2) );
		System.out.println("p2 is " + p2.distanceFromOrigin());
	}
}
