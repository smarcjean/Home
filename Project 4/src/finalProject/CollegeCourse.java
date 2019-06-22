package finalProject;

import javax.swing.JOptionPane;

public class CollegeCourse {
	
	protected String dept;
	protected int courseNumber;
	protected int credits;
	protected int price;
	
	public CollegeCourse(String dept, int id, int cr) {
		final int FEEPERCOURSE = 120;
		this.dept = dept;
		this.courseNumber = id;
		this.credits = cr;
		
		price = FEEPERCOURSE * credits;
	}
	
	// write a display method
	public void display() {
		JOptionPane.showConfirmDialog(null, dept + courseNumber + "\nnon-lab course\n " + credits 
				+ " credits\nfee is $" + price);
	}

}
