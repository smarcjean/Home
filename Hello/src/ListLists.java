import java.util.ArrayList;
import java.util.List;

public class ListLists {
	

	public static void main(String[] args) {
    
		
        // The user list
		
		List<User> users = new ArrayList<User>();
		User user1 = new User();
	
		user1.setFirstName( "John");
        user1.setLastName("Lade");
		user1.setEmail("johnlade@gmail.com");
		user1.setPassword("johnclassM");
		
		
		User user2 = new User();
		
		user2.setFirstName("Larry");
		user2.setLastName("Jerry");
		user2.setEmail("larryjerry1@gmail.com");
		user2.setPassword("lefttoright12");
		
		User user3 = new User();
		
		user3.setFirstName("Karry");
		user3.setLastName("Perry");
		user3.setEmail("karryperry1@gmail.com");
		user3.setPassword("boolean214");
		
				
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		
		
		// Create the order object
		   
		List<Order> list1 = new ArrayList<Order>();
		Order order1 = new Order();
		user1.userOrder = order1;
		
		order1.setItem("kite", "phone", "jeans", "book" );
		order1.setQuantity("4");
		order1.setUserID("48732");
		order1.setShippingAddress("North Berwick", "Fox Farm Hill Rd", "Maine", "04739");
		order1.setCost("380");
		
		
		// user2 
		Order order2 = new Order();
		
		user2.userOrder = order2;
		
		order2.setItem("hat", "CD", "movie", "glasses" );
		order2.setQuantity("4");
		order2.setUserID("32845");
		order2.setShippingAddress("North Berwick", "Fox Farm Hill Rd", "Maine", "04739");
		order2.setCost("230");
		
		Order order3 = new Order();
		user3.userOrder = order3;
		
		order3.setItem("cup", "xbox", "fifa", "controller" );
		order3.setQuantity("4");
		order3.setUserID("32845");
		order3.setShippingAddress("North Berwick", "Fox Farm Hill Rd", "Maine", "04739");
		order3.setCost("450");
		
		// Create the address object
		
		Address address1 = new Address();
		
		
		address1.setStreet("Blue Berry Hill Rd");
		address1.setCityName("North Berwick");
		address1.setStateName("Maine");
		address1.setZipcode("04309");
		
		
		Address address2 = new Address();
		
		address2.setStreet("Farm Fox Hill Rd");
		address2.setCityName("Kennybunk");
		address2.setStateName("Maine");
		address2.setZipcode("03509");
		
	
		
		Address address3 = new Address();
		
		address3.setStreet("Farm Fox Hill Rd");
		address3.setCityName("North Berwick");
		address3.setStateName("Maine");
		address3.setZipcode("05309");
		
	}

}
