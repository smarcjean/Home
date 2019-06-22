package poly;

public class TobyTeeShirtCompany {
	int orderNum;
	String size;
	String color;
	double price;
	
	public void setOrderNum(int number) {
		orderNum = number;
		
	}
	public void setSize(String sz) {
		size = sz;
		if (size == "XXL" || size == "XXXL") {
			price = 22.99;
			
		} else {
			price = 19.99;
		}
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getOrderNumb() {
		return orderNum;
	}

}
