package projects;
import javax.swing.*;
public class FindRent {
	public static void main(String[] args) {
		int[][] rents = { {400, 450, 510},         // floor 0  // bedroom 0, 1, 2
				          {500, 560, 630},        // floor 1    bedroom 0, 1, 2
				          {625, 676, 740},       // floor 2    bedroom 0, 1, 2
				          {1000, 1250, 1600}};  // floor 3     bedroom 0, 1, 2
		
		String entry;
		int floor;
		int bedrooms;
		entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
		floor = Integer.parseInt(entry);
		entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
		bedrooms = Integer.parseInt(entry);
		JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + ""
				+ " bedroom appartment on floor " + floor + " is $" + rents[floor][bedrooms] );
	}

}
