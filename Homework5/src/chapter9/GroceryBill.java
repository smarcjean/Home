package chapter9;

public class GroceryBill extends Employeee {
	protected double bread;
	protected double egg;
	protected Employeee clerk;
	protected double total;
	
	public GroceryBill(Employeee clerk) {
		super(clerk);
		
		this.clerk = clerk;
	}
	public void add(Item i) {
		bread = 5;
		egg = 4;
		total = 9;
	}
	public double getTotal() {
		return total;
	}
	public void printReceipt() {
		System.out.println("your total price is $" + total);
	}

}
