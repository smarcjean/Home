package chapter9;

public class RandomIncrementer implements Incrementable {
	private int x;
	
	
	public void setValue(int x) {
		this.x = x;
		
	}
	
	public int getValue() {
		return x;
	}
	@Override
	public void increment() {
		this.x = x;
		x = (int) (Math.random() *  9 + 3);
		x++;
	}

	
	
	

}
