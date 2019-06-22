	package userFriendly;
	import java.util.*;
	
	
	public class User {
	
		String firstName;
	 	String lastName;
		String email;
		String password;
		private Address address;
	
		
		public void setUser(String firstName, String lastName, String email, String password, Address address) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.address = address;
		}
	
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
	
		public Address getAddress() {
			return address;
		}
	
		public void setAddress(Address address) {
			this.address = address;
		}
		// String the user's address
		// return the information as a string
		public String address() {
			return  address.street + ", " + address.city + ", " + address.state + " " + address.zipcode;
		}
	
	}