package poly;

public class Customer {
	private int idNum;
	private double balanceOwed;
	public Customer(int id, double bal) {
		idNum = id;
		balanceOwed = bal;
	}
	public void display() {
		System.out.println("Customer #" +  idNum + " Balance $" + balanceOwed);
	}
}
