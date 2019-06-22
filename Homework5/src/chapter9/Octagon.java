package chapter9;

public class Octagon implements Shape {
	private int side;
	
	public Octagon(int a) {
		this.side = a;
		
	}
	
	public double getArea() {
		return side * side * side * (1 + Math.sqrt(2));
	}
	public double getPerimeter() {
		return 8 * side;
	}
	

}
