package programs;

// This program is about objects and classes and how they work
// with a constructor
public class Robots1 {
	String name;
	String color;
	int weight;
	
	
	// write a constructor
	public Robots1(String n, String c, int w) {
		this.name = n;
		this.color = c;
		this.weight = w;
	}
	
	// write a method
	public void introduceSelf() {
		System.out.println("my name is " +  name);
	}
	public static void main(String[] args) {
		Robots1 one = new Robots1("Love", "white", 50);
		Robots1 two = new Robots1("Don", "black", 70);
		
		one.introduceSelf();
		two.introduceSelf();
	}

}
