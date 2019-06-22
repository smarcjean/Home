package chapter10;

import java.awt.geom.Point2D;

// A Point object represents a pair of (x, y) coordinates.
	// Fourth version: encapsulated

	public class Point implements Comparable<Point> {
		private int x;
		private int y;
		
		// constructs a new point at the origin (0, 0)
		public Point() {
			this(0, 0);  // calls Point(int, int,) constructor
			
		}
		
		// constructs a new point with the given (x, y) location
		public Point(int x, int y) {
			setLocation(x, y);
		}
		
		
		// returns the distance between this point and (0, 0)
		public double distanceFromOrigin() {
			return Math.sqrt(x * x + y * y);
		}
		
		// returns the x-coordinate of this point
		public int getX() {
			return x;
		}
		
		// returns the y-coordinate of this point
		public int getY() {
			return y;
		}
		
		// sets this point's (x, y) location to the given values
		public void setLocation(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		// returns s String represention of this point 
		public String toString() {
			return "(" + x + "," + y + ")";
			
		}
		
		// shifts this point's location by the given amount
		public void translate(int dx, int dy) {
			setLocation(x + dx, y + dy);
		}
		
		// Returns which quadrant of the x/y plance the current Point object falls in.
		public int quadrant() {
			if (this.x > 0 && this.y > 0) {
				return 1;
				
			} 
			if (this.x < 0 && this.y > 0) {
				return 2;
				
			} 
			if (this.x < 0 && this.y < 0) {
				return 3;
			} 
			if (this.x > 0 && this.y < 0) {
				return 4;
			} else {
				return 0;
			}
			
		}
		
		// Negates and swaps the x/y coordinate of the Point object.
		public void flip() {
			int temp = this.x;
			this.x = this.y;
			this.y = temp;
			if (x > 0 && y > 0) {
				 temp = this.x;
				this.x = -this.y;
				this.y = -temp;
			}
		}
		
		// Returns the "Manhattan distance" between the current Point object and the given other Point object.
		public int manhattanDistance(Point other) {
			return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
			
		}

		// Returns true if the given Point lines up vertically with this Point,
		//that is, if their x-coordinate are the same.
		public boolean isVertical(Point other) {
			return (this.x == other.x);
		}
		
		// Returns the slope of the line drawn between this Point and the given other Point
		public double slope(Point other) {
			if (this.x == other.x) {
				throw new IllegalArgumentException();
			}
			return (this.y - other.y) / (this.x - other.x);
		}
		
		// Returns whether this Point is collinear with the given two other Points.
		// Points are collinear if a straight line can be drawn that connects them.
		public boolean isCollinear(Point p1, Point p2) {
			if (this.x == p1.x || this.x == p2.x) {
				return this.x == p1.x && this.x ==p2.x;
			}
				// find their slopes
				double m1 =  (this.y - p1.y) / (this.x - p1.x);
				double m2 = (this.y - p2.y) / (this.x - p2.x);
				
				if (m1 == m2) {
					return true;
					
				
			}
			return false;
		}
		
		public int compareTo(Point point) {
		    Point origin = new Point(0, 0);
		    double d = this.manhattanDistance(origin) - point.manhattanDistance(origin);

		    if(d < 0) {
		        return -1;
		    } else if(d > 0) {
		        return 1;
		    }

		    return (int) d;
    }
		
	}
