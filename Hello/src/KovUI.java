

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class KovUI {

	private JFrame frame;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	private JTextField textFieldStreet;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTextField textFieldZipcode;
	private JTextField textFieldItem;
	private JTextField textFieldQuantity;
	private JTextField textFieldUserID;
	private JTextField textFieldShippingAddress;
	private JTextField textFieldCost;
	private JLabel lblNewLabel;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KovUI window = new KovUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KovUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAnswer = new JButton("User's Info");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User newUser = new User();
				newUser.setFirstName(textFieldFirstName.getText());
				newUser.setLastName(textFieldLastName.getText());
				newUser.setEmail(textFieldEmail.getText());
				newUser.setPassword(textFieldPassword.getText());
				System.out.println("The name of the user is " + newUser.getFirstName() + " " + newUser.getLastName());
				System.out.println("The user's email is " + newUser.getEmail());
				System.out.println("The user's password is " + newUser.getPassword());
				
				//User's address
				Address newAddress = new Address();
				newUser.userAddress = newAddress;
				
				newAddress.setStreet(textFieldStreet.getText());
				newAddress.setCityName(textFieldStreet.getText());
				newAddress.setStateName(textFieldState.getText());
				newAddress.setZipcode(textFieldZipcode.getText());
				System.out.println("The User's Street is " + newUser.userAddress.getStreet());
				System.out.println("The User's City is " + newUser.userAddress.getCityName());
				System.out.println("The User's State is " + newUser.userAddress.getStateName());
				System.out.println("The User's Zipcode is " + newUser.userAddress.getZipcode());
				 
				
				// user's order
				
				Order newOrder = new Order();
				newUser.userOrder = newOrder;
				
				newOrder.setItem(textFieldItem.getText(), null, null, null);
				newOrder.setQuantity(textFieldQuantity.getText());
				newOrder.setUserID(textFieldUserID.getText());
				newOrder.setShippingAddress(textFieldShippingAddress.getText(), null, null, null);
				newOrder.setCost(textFieldCost.getText());
				System.out.println("The User's Order Item " + newUser.userOrder.getItem());
				System.out.println("The User's Order Quantity is " + newUser.userOrder.getQuantity());
				System.out.println("The User's UserID is " + newUser.userOrder.getUserID());
				System.out.println("The User's ShippingAddress is " + newUser.userOrder.getShippingAddress());
				System.out.println("The User's Orders Cost is " + newUser.userOrder.getCost());
				
				
				
				
				
			}
		});
		btnAnswer.setBounds(145, 217, 113, 23);
		frame.getContentPane().add(btnAnswer);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setText("marc");
		textFieldFirstName.setBounds(26, 63, 86, 20);
		frame.getContentPane().add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setText("jean");
		textFieldLastName.setBounds(26, 94, 86, 20);
		frame.getContentPane().add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setText("marcjean@gmail.com");
		textFieldEmail.setBounds(26, 125, 86, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setText("friendly");
		textFieldPassword.setBounds(26, 156, 86, 20);
		frame.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setText("Fox Farm Hill Rd");
		textFieldStreet.setBounds(145, 63, 86, 20);
		frame.getContentPane().add(textFieldStreet);
		textFieldStreet.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setText("North Berwick");
		textFieldCity.setBounds(145, 94, 86, 20);
		frame.getContentPane().add(textFieldCity);
		textFieldCity.setColumns(10);
		
		textFieldState = new JTextField();
		textFieldState.setText("Maine");
		textFieldState.setBounds(145, 125, 86, 20);
		frame.getContentPane().add(textFieldState);
		textFieldState.setColumns(10);
		
		textFieldZipcode = new JTextField();
		textFieldZipcode.setText("034709");
		textFieldZipcode.setBounds(145, 156, 86, 20);
		frame.getContentPane().add(textFieldZipcode);
		textFieldZipcode.setColumns(10);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(43, 23, 69, 23);
		frame.getContentPane().add(lblUser);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(157, 27, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBounds(293, 27, 46, 14);
		frame.getContentPane().add(lblOrder);
		
		textFieldItem = new JTextField();
		textFieldItem.setBounds(272, 63, 86, 20);
		frame.getContentPane().add(textFieldItem);
		textFieldItem.setColumns(10);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBounds(272, 94, 86, 20);
		frame.getContentPane().add(textFieldQuantity);
		textFieldQuantity.setColumns(10);
		
		textFieldUserID = new JTextField();
		textFieldUserID.setBounds(272, 125, 86, 20);
		frame.getContentPane().add(textFieldUserID);
		textFieldUserID.setColumns(10);
		
		textFieldShippingAddress = new JTextField();
		textFieldShippingAddress.setBounds(272, 156, 86, 20);
		frame.getContentPane().add(textFieldShippingAddress);
		textFieldShippingAddress.setColumns(10);
		
		textFieldCost = new JTextField();
		textFieldCost.setBounds(272, 182, 86, 20);
		frame.getContentPane().add(textFieldCost);
		textFieldCost.setColumns(10);
		
		
		
		
	}
}
