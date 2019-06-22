package programs;

// This program is all about explaning how objects and classes works
// without a constructor

public class Robots {
	String name;
	String color;
	int weight;
	
	
	public void introduceSelf() {
		System.out.println("my name is " + name);
	}
	public static void main(String[] args) {
		Robots r1 = new Robots();
		Robots r2 = new Robots();
		
		
		// assign the values to the r1 field
		r1.name = "Kency";
		r1.color = "red";
		r1.weight = 40;
		
		// assign the values to the r2 field
		r2.name = "Tom";
		r2.color = "Yellow";
		r2.weight = 50;
		
		// call the method
		r1.introduceSelf();
		r2.introduceSelf();
	}

}
