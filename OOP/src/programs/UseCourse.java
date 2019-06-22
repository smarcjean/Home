package programs;

import javax.swing.*;

public class UseCourse {
	public static void main(String[] args) {
		
		String department, inStr;
		String[] labCourses = {"Bio", "CHM", "CIS", "Phy"};
		int id, credits;
		int found = 0;
		int x;
		department = JOptionPane.showInputDialog(null, "Enter department");
		inStr = JOptionPane.showInputDialog(null, "Enter course number");
		id = Integer.parseInt(inStr);
		inStr = JOptionPane.showInputDialog(null, "Enter credits");
		credits = Integer.parseInt(inStr);
		for (x = 0; x < labCourses.length; x++) {
			if (department.equals(labCourses[x])) {
				found = 1;
			}
			if (found == 1) {
				LabCourse course = new LabCourse(department, id, credits);
				course.display();
			} else {
				CollegeCourse course = new CollegeCourse(department, id, credits);
				course.display();
			}
		}
	}

}
