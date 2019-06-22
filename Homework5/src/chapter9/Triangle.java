package chapter9;

public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getArea() {
		double s = ( a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public double getPerimeter() {
		return a + b + c;
	}
	
	public boolean equals(Triangle other) {
		return (this.a == other.a && this.b == other.b && this.c == other.c);
	}

}
