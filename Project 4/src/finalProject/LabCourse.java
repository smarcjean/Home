package finalProject;

import javax.swing.JOptionPane;

public class LabCourse extends CollegeCourse {
	
	protected final int LABFEE = 50;
	
	public LabCourse(String dept, int id, int cr) {
		super(dept, id, cr);
		price = price + LABFEE;
	}
	
	// override the parent class
	public void display() {
		JOptionPane.showMessageDialog(null, dept + courseNumber + "\nLab Course\n " 
				+ credits + " credits\nLab fee is $" + LABFEE + "\ntotal price is $" + price);
	}
}
