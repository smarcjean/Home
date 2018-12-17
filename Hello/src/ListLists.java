
import java.util.*;


public class ListLists {
	
	
	ArrayList<User> us = new ArrayList<User>();
	ArrayList<Address> ad = new ArrayList<Address>();
	ArrayList<Order> or = new ArrayList<Order>();
	

	
    // store each each class
public void store(User user, Address address, Order order) {		
 
		
	us.add(user);
	ad.add(address);
	or.add(order);
	
}
// load each class 
public void load() {
    us.getClass();
    ad.getClass();
    or.getClass();
	
	
}

	
	
}

