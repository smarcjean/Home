	package userFriendly;
	 
	
	public class Order {
		    
		String item;
		String quanity;
		String userID;
		String cost;
		private Address address;
		private User name;
	
		
		public void setOrder(String item, String quanity, String userID, String cost, Address address,  User name) {
			this.item = item;
			this.quanity = quanity;
			this.userID = userID;
			this.address = address;
			this.cost = cost;
			this.address = address;
			this.name = name;
		}
	
		public String getItem() {
			return item;
		}
	
		public void setItem(String item) {
			this.item = item;
		}
	
		public String getQuanity() {
			return quanity;
		}
	
		public void setQuanity(String quanity) {
			this.quanity = quanity;
		}
	
		public String getUserID() {
			return userID;
		}
	
		public void setUserID(String userID) {
			this.userID = userID;
		}
		
		public Address getAddress() {
			return address;
		}
	
		public void setAddress(Address address) {
			this.address = address;
		}
	
		public User getName() {
			return name;
		}
	
		public void setName(User name) {
			this.name = name;
		}
	
		public String getCost() {
			return cost;
		}
	
		public void setCost(String cost) {
			this.cost = cost;
		}
		
		public String shippingAddress() {
			
			return name.firstName + " " + name.lastName + " " + address.street + ". " + address.city + ", " + address.state + " " + address.zipcode;
		}
	
	}