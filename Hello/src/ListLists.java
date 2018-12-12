import java.util.ArrayList;
import java.util.List;


public class ListLists {
	
	static List<User> users = new ArrayList<User>();
	
	
	public void printList() {
		for(User user : users) {
			System.out.println("The user's firstName is " + user.getFirstName());
			System.out.println("The user's lastName is " + user.getLastName());
			System.out.println("The user's e-mail is " + user.getEmail());
			System.out.println("The user's password is " + user.getPassword());
			System.out.println("The user's address is ");
			
			System.out.println("Street: " + user.userAddress.getStreet());
			System.out.println(" City: " + user.userAddress.getCityName());
			System.out.println("State: " + user.userAddress.getStateName());
			System.out.println("Zipcode: " + user.userAddress.getZipcode());
			
			System.out.println("The User's Order Item: " + user.userOrder.getItem());
			System.out.println("The User's Order Quantity: " + user.userOrder.getQuantity());
			System.out.println("The User's UserID: " + user.userOrder.getUserID());
			System.out.println("The ShippingAddress is ");
			System.out.println("The User's Orders Cost: " + user.userOrder.getCost());
			
			System.out.println("The User's Shipping Street: " + user.userOrder.shippingAddress.getStreet());
			System.out.println("The User's Shipping City: " + user.userOrder.shippingAddress.getCityName());
			System.out.println("The User's Shipping State: " + user.userOrder.shippingAddress.getStateName());
			System.out.println("The User's Shipping Zipcode: " + user.userOrder.shippingAddress.getZipcode());
			
			
			
		}
	}
	
p
	
    
public void Save(User u, Address s, Order o) {		
 
		ArrayList<User> userLists = new ArrayList<User>();
		ArrayList<Address> addressLists = new ArrayList<Address>();
		ArrayList<Order> orderLists = new ArrayList<Order>();
	userLists.add(u);
	userLists.add(s);
	userLists.add(o);
		
}