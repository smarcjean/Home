package chapter8;
// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
	String name;
	double balance;
	double transactions = 0.00;
	
	public void deposit (double amount) {
		balance = balance + amount;
		
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	public boolean transactionFee(double fee) {
		double amount = (fee * transactions * (transactions + 1)) / 2;
		if ( amount > balance) {
			balance = balance - amount;
			return true;
		}
		balance = 0;
		return false;
	}
	public String toString() {
		 String sign = "";
		    String pad = "";
		    
		    if(balance < 0) {
		        balance = -balance;
		        sign = "-";
		    }
		    
		    int temp = (int) (balance * 100);
		    int intPart = temp / 100;
		    int decPart = temp % 100;
		    
		    if(decPart < 10)
		        pad = "0";
		    
		    return name + ", " + sign + "$" + intPart + "." + pad + decPart;
	}
	public void tranfer( BankAccount bank, double amount) {
		if (balance < 5 || amount <= 0) {
			balance = balance;
		}
		if (balance > 5 + amount) {
			bank.deposit(balance -5);
			this.withdraw(balance);
		} else {
			bank.deposit(amount-5);
			this.deposit(amount -5);
		}
	}
	public static void main(String[] args) {
		BankAccount ben = new BankAccount();
		ben.deposit(80.00);
		BankAccount hal = new BankAccount();
		hal.deposit(20.00);
		ben.tranfer(hal, 20.00);
		ben.tranfer(hal, 10.00);
		hal.tranfer(ben, 60.00);
		
		System.out.println("Ben balance after the transfer " + ben.balance);
		System.out.println("Hal balance after transfer " + hal.balance);
	}
}
