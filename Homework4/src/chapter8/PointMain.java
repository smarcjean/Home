package chapter8;

// A program that deals with points.

public class PointMain {
	public static void main(String[] args) {
		// create two point objects
		Point p1 = new Point(7, 17);
		
		Point p2 = new Point(4, 5);
		
		// print each point and its distance from the origin
		System.out.println("P1 is " + p1);
		System.out.println(p1);
		p1.flip();
		System.out.println(p1);
		System.out.println("distance from origin = " + p1.distanceFromOrigin());
		
		System.out.println("P2 is " + p2);
		System.out.println("distance from origin = " + p2.distanceFromOrigin());
		
		p1.quadrant();
		System.out.println("What quadrant is p1 x/y is? " + p1.quadrant());
		p2.quadrant();
		System.out.println("What quandrant is p2 x/y is? " + p2.quadrant());
		
		System.out.println("are they collinear? " + p1.isCollinear(p1, p2));
		
		System.out.println("Slope " + p1.slope(p2));
		// translate each point to a new location
		p1.translate(11, 6);
		p2.translate(1, 7);
		
		// print the points again
		System.out.println("p1 is " + p1);
		System.out.println("p2 is " + p2);
		
		
		
	}

}
