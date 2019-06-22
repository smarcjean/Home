package chapter9;

public class Hexagon implements Shape {
	
	private int side;
	
	
	public Hexagon(int side) {
		this.side = side;
		
	}
	
	public double getArea() {
		return 3 *( Math.sqrt(3) * side * side) / 2.0;
	}
	
	public double getPerimeter() {
		return 6 * side;
	}
	
	

}
