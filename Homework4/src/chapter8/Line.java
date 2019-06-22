package chapter8;

public class Line {
	
	Point p1;
	Point p2;

	// constructs a new Line that contains the given points
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// Returns this Line's endpoint
	public Point getP1() {
		return p1;
	}
	
	// Returns this Line's endpoint
	public Point getP2() {
		return p2;
	}
	public String toString() {
		return "[(" + p1.toString() + "," + p2.toString() + ")]";
	}
	
	// find the slope betwenn the points
	public double getSlope()  {
		if (p1.getX() == p2.getX()) {
			throw new IllegalArgumentException();
			
			
		}
		return ((double)(p2.getY() - p1.getY())) / (p2.getX() - p1.getX());
			
	}
	
	// constructs a new Line that contains the given two Points
	public Line(int x1, int y1, int x2, int y2) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setLocation(x1, y1);
		p2.setLocation(x2, y2);
	}
	
	//Returns true if the given Point is collinear with the Points of this Line
	// that is, if, when this Line is stretched infinitely, it would eventually hit the given Point
	public boolean isCollinear(Point p) {
		Math.round(p1.getX());
		Math.round(p2.getX());
		if (p1.getX() == p2.getX()) {
			return p.getX() == p1.getX();
				
		}
		
		double m1 = (double) (p.getY() - p1.getY()) / (p.getX() - p1.getX());
		double m2 = (double) (p.getY() - p2.getY()) / (p.getX() - p2.getX());
		return m1 == m2;
	}
	
	
	
	
	
	
}
