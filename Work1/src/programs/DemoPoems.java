package programs;

public class DemoPoems {
	public static void main(String[] args) {
	Poem p = new Poem("Lona of the Kola", 2);
	lol(p.getName());
	lol(p.getLines());
	System.out.println("---------");
	
	Couplet c = new Couplet("Poma of the Lova");
	lol(c.getLines());
	lol(c.getName());

	}
	public static void lol(Object a) {
	System.out.println(a);
	
	}
	
}
