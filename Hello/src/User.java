import java.util.ArrayList;
import java.util.List;

// should connect to address and ....
public class User {

	public  String firstName;
	public String lastName;
	public String email;
	public String password;
	
	Address userAddress = new Address();
	Order userOrder = new Order();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void add() {
		
		
	}
	

}
