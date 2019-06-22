package poly;

public class TestCustomer {
	public static void main(String[] args) {
		Customer oneCust = new Customer(124, 123);
		PreferredCustomer onePCust = new PreferredCustomer(125,3456,0.15);
		oneCust.display();
		onePCust.display();
		
	}
}


// you cannot override
// static methods
// final methods, 
// class final