import java.util.ArrayList;

import java.util.*;

public class LoaderClass {
	public static void main(String[] args) {
		
		// Load users / address / orders from a file?
		// Write orders / users / addresses to file.
		// Create list of users / orders / addresses.
		// Create UI to add to list.
		Order order1 = new Order();
		
		   order1.user.setFirstName( "John");
		   order1.user.setLastName("Lade");
		   order1.user.setEmail("johnlade@gmail.com");
		   order1.user.setPassword("johnclassM");
		   order1.setUserID(3432);
		   order1.user.userAddress.setCityName("North Berwick");
		   order1.user.userAddress.setStreet("Fox Farm Hill Rd");
		   order1.user.userAddress.setStateName("Maine");
		   order1.user.userAddress.setZipcode("04739");
	
	
	
	
	
	Order order2 = new Order();
	order2.user.setFirstName("Bob");
	order2.user.setLastName("Kyle");
	order2.user.setEmail("bobkyle@gmail.com");
	order2.user.setPassword("bobclassroom");
	order2.setUserID(83621);
	order2.user.userAddress.setCityName("North Berwick");
	order2.user.userAddress.setStreet("Fox Farm Hill Rd");
	order2.user.userAddress.setStateName("Maine");
	order2.user.userAddress.setZipcode("04739");
	
	
	
	Order order3 = new Order();
	order3.user.setFirstName("Keith");
	order3.user.setLastName("Valdey");
	order3.user.setEmail("keithvaldey@gmail.com");
	order3.setUserID(87641);
	order3.user.userAddress.setCityName("North Berwick");
	order3.user.userAddress.setStreet("Fox Farm Hill Rd");
	order3.user.userAddress.setStateName("Maine");
	order3.user.userAddress.setZipcode("04739");
	order3.setShippingAddress("North Berwick", "Fox Farm Hill Rd", "Maine", "04739");
	
	

	List<Order> orders = new ArrayList<>();
	
	orders.add(order1);
	orders.add(order2);
	orders.add(order3);
	
	// set the orders, costs and the quality of the products for user1
	
	order1.setItem("laptop","pencil","book", "notebook" );
	order1.setCost(250);
	order1.setQuality("good");
	
	// set the orders, costs and the quality of the products for user2

	order2.setItem("backpack","phone","charger","battery");
	order2.setCost(120);
	order2.setQuality("great");
	
	// set the orders, costs and the quality of the products for user3

	order3.setItem("glue","paper","scissors","tape");
	order3.setCost(89);
	order3.setQuality("ok");

	

	System.out.println(order1 );
	
	// give a list of user names
	List<String> user1 = new ArrayList<>();
	
	user1.add("steve");
	user1.add("user2");
	user1.add("user3");
	user1.add("user4");
	
	
	
	
	}

	

}
