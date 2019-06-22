package chapter9;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2.0 * (width + height);
	}
	
	public boolean equals(Rectangle other) {
		return (this.width == other.width && this.height == other.height);
	}
	

}
