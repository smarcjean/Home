package chapter9;

public class AdvanceTicket extends Ticket {
	private int daysAdvance;
	private int price;
	public AdvanceTicket(int n, int d) {
		super(n);
		this.daysAdvance = d;
		
		if(d >= 10) {
			price = 30;
		} else {
			price = 40;
		}
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return ("Number: " + number + ", " + "Price: $" + price );
	}
	
	
}
