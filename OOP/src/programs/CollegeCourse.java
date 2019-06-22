package programs;

import javax.swing.JOptionPane;

public class CollegeCourse {
	protected String department;
	protected int courseNumber;
	protected int credits;
	protected double price;
	
	public CollegeCourse(String dep, int cn, int cr) {
		final int FEEPERCOURSE = 120;
		this.department = dep;
		this.courseNumber = cn;
		this.credits = cr;
		
		price = FEEPERCOURSE * credits;
		
	}
	public void display() {
		JOptionPane.showMessageDialog(null,
		         department + courseNumber + "\nNon-lab course\n" + 
		 credits +
		         " credits\nTotal fee is $" + price);
		   }
		
	}
	
	


