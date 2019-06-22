package finalProject;

import javax.swing.*;

public class UseCourse {
	public static void main(String[] args) {
		String dept, inStr;
		String[] courses = { "BIO", "CHM", "CIS", "PHY"};
		int courseNumber, credits;
		int x;
		int found = 0;
		
		dept = JOptionPane.showInputDialog(null, "Enter department");
		inStr = JOptionPane.showInputDialog(null, "Enter course number");
	    courseNumber = Integer.parseInt(inStr);
	    inStr = JOptionPane.showInputDialog(null, "Enter credits");
	    credits = Integer.parseInt(inStr);
	    
	    // use a for loop
	    for (x = 0; x < courses.length; x++) {
	    	if (dept.equals(courses[x])) {
	    		found = 1;
	    	} 
	    	if (found == 1) {
	    		LabCourse course = new LabCourse(dept, courseNumber, credits);
	    		course.display();
	    	} else {
	    		CollegeCourse course = new CollegeCourse(dept, courseNumber, credits);
	    		course.display();
	    	}
	    }
		
	}

}
