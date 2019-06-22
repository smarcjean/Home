package exam;

public class DemoPoem {
	public static void main(String[] args) {
		Poem poem1 = new Poem("The Raven", 84);
		Couplet poem2 = new Couplet("True Wit");
		Limerick poem3 = new Limerick("There was an Old Man with a Beard;");
		Haiku poem4 = new Haiku("The Wren");
		
		System.out.println("Poem 1 is called \"" + poem1.getName() + "\" and has " + poem1.getLines() + " lines");
		System.out.println("Poem 2 is called \"" + poem2.getName() + "\" and has " + poem2.getLines() + " lines");
		System.out.println("Poem 3 is called \"" + poem3.getName() + "\" and has " + poem3.getLines() + " lines");
		System.out.println("Poem 4 is called \"" + poem4.getName() + "\" and has " + poem4.getLines() + " lines");
		
	}
	
}
