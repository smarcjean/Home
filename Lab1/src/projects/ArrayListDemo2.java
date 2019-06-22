package projects;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		String name;
		final int LIMIT = 4;
		for (int x = 0; x < LIMIT; ++x) {
			name = JOptionPane.showInputDialog(null, "Enter a student's name");
			students.add(name);
		}
		System.out.println("The names are " + students);
	}

}
