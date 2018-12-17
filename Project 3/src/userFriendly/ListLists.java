		package userFriendly;
		
		import java.util.*;
		
		// Create classes that model this scenario
		// Create a class to load and store lists of Users, Addresses, and Orders.
		// Create a UI to create (add to above lists(s) Users, Addresses, and Orders.
		// Java best practices are expected. Good names, comments, proper case sensitivity, etc..
		public class ListLists {
			
			ArrayList<User> us = new ArrayList<User>();
			ArrayList<Address> ad = new ArrayList<Address>();
			ArrayList<Order> or = new ArrayList<Order>();
			
		    // store each class to its list
		public void store(User user, Address address, Order order) {		
		 		
			us.add(user);
			ad.add(address);
			or.add(order);
			
		}
		// load the classes to ListLists 
		public void load() {
		    us.getClass();
		    ad.getClass();
		    or.getClass();
			
		}	
			
		}
		
