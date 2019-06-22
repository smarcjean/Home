package exam;

public class Poem {
	protected String name;
	protected int lines;
	
	public Poem(String name, int lines) {
		this.name = name;
		this.lines = lines;
	}
	public String getName() {
		return name;
	}
	public int getLines() {
		return lines;
	}

}
