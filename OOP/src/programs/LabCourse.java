package programs;

import javax.swing.JOptionPane;

public class LabCourse extends CollegeCourse{
	 private final int LABFEE = 50;
	  
	 public LabCourse(String dept, int id, int credits)
	   {
	   
	   super(dept,  id, credits);
	     
	 price = price + LABFEE;
	   }
	  
	 @Override
	  
	 public void display()
	   {
	   
	   JOptionPane.showMessageDialog(null,
	      
	   department + courseNumber + "\nLab course\n" +  credits +
	         " credits\nLab fee is $" 
	+ LABFEE +
	         "\nTotal fee is $" + price);
	   }
	}



