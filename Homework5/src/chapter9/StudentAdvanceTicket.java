package chapter9;

public class StudentAdvanceTicket extends AdvanceTicket {
	private int d;
	private int price;
	
	public StudentAdvanceTicket(int n, int d) {
		super(n, d);
		
		if (d >= 10) {
			price = 15;
		} else {
			price = 20;
		}
	}
	@Override
	public String toString() {
		return ("Number: " + number + ", " + "Price: " + price + " (ID required)" );
	}

}
