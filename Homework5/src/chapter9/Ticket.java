package chapter9;

public class Ticket {
	protected int number;
	protected double price;
	
	public Ticket(int n) {
		this.number = n;
		price = 0.0;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return ("Number: " + number + ", " + "Price: " + price );
	}

}
