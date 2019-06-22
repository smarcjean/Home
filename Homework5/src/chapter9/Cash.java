package chapter9;

public class Cash {
	private double amount;
	
	
	// constructs a cash investment of the given amount
	public Cash(double amount) {
		this.amount = amount;
		
	}
	
	// since cas is fixed asset, it never has any profit
	public double getProfit() {
		return 0.0;
	}
	
	// sets the amount of cash invested to the given value
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean equalsCash(Cash other) {
	 return (this.amount == other.amount);
			
		
	}

}
