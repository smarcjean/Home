 
// should connect to user and address
public class Order {
	    
		private String item;
	    private String quantity;
	    private String userID;
	    private String cost;	
	    Address shippingAddress = new Address();
	   
		public String getItem() {
			return item;
		}
		public void setItem(String item, String string, String string2, String string3) {
			this.item = item;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String string) {
			this.quantity = string;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String string) {
			this.userID = string;
		}
		
		public String getCost() {
			return cost;
		}
		public void setCost(String string) {
			this.cost = string;
		}
		
		

}
