package chapter9;

public class WalkupTicket extends Ticket {
	
	
	public WalkupTicket(int n) {
		super(n);
		final int PRICE = 50;
		price = PRICE;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return ("Number: " + number + ", " + "Price: $" + price );
	}
	
	

}
