package chapter9;

public class SequentialIncrementer implements Incrementable {
	public int y;
	
	public void setValue(int y) {
		y = 0;
	}
	public int getValue() {
		return y;
	}
	public void increment() {
		this.y = y;
		y++;
	}
	
}
