package chapter9;

public class Item {

		protected String name;
		protected double cost;
		protected double discount;
		
		public Item(String n, double c, double d) {
			this.name = n;
			this.cost = c;
			this.discount = d;
			
			discount = cost * .25;
		}
		public String getName() {
			return name;
		}
		public double getCost() {
			return cost - discount;
		}
		public double getDiscount() {
			return cost * .25;
		}
}
