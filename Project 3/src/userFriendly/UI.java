	package userFriendly;
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.awt.event.ActionEvent;
	
	// Create a UI to create (add to above list(s) Users, Addresses, and Orders.
	
	
	public class UI {
		
		ListLists l = new ListLists();
		User user = new User();
		Address address = new Address();
		Order order = new Order();
	
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
		private JTextField textFieldCost;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						UI window = new UI();
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
		public UI() {
			initialize();
		}
	
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 881, 410);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			
			
			JLabel lblUser = new JLabel("User");
			lblUser.setBounds(98, 35, 46, 14);
			frame.getContentPane().add(lblUser);
			
			JLabel lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(21, 74, 65, 14);
			frame.getContentPane().add(lblFirstName);
			
			JLabel lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(21, 112, 65, 14);
			frame.getContentPane().add(lblLastName);
			
			JLabel lblEmail = new JLabel("Email");
			lblEmail.setBounds(21, 150, 46, 14);
			frame.getContentPane().add(lblEmail);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setBounds(21, 191, 46, 14);
			frame.getContentPane().add(lblPassword);
			
			textFieldFirstName = new JTextField();
			textFieldFirstName.setBounds(95, 68, 132, 30);
			frame.getContentPane().add(textFieldFirstName);
			textFieldFirstName.setColumns(10);
			
			textFieldLastName = new JTextField();
			textFieldLastName.setBounds(98, 106, 127, 30);
			frame.getContentPane().add(textFieldLastName);
			textFieldLastName.setColumns(10);
			
			textFieldEmail = new JTextField();
			textFieldEmail.setBounds(98, 147, 127, 30);
			frame.getContentPane().add(textFieldEmail);
			textFieldEmail.setColumns(10);
			
			textFieldPassword = new JTextField();
			textFieldPassword.setBounds(98, 188, 127, 30);
			frame.getContentPane().add(textFieldPassword);
			textFieldPassword.setColumns(10);
			
			JLabel lblAddress = new JLabel("Address");
			lblAddress.setBounds(349, 35, 46, 14);
			frame.getContentPane().add(lblAddress);
			
			JLabel lblStreet = new JLabel("Street");
			lblStreet.setBounds(312, 74, 46, 14);
			frame.getContentPane().add(lblStreet);
			
			JLabel lblCity = new JLabel("City");
			lblCity.setBounds(312, 112, 46, 14);
			frame.getContentPane().add(lblCity);
			
			JLabel lblState = new JLabel("State");
			lblState.setBounds(312, 150, 46, 14);
			frame.getContentPane().add(lblState);
			
			JLabel lblZipcode = new JLabel("Zipcode");
			lblZipcode.setBounds(312, 191, 46, 14);
			frame.getContentPane().add(lblZipcode);
			
			textFieldStreet = new JTextField();
			textFieldStreet.setBounds(349, 71, 127, 20);
			frame.getContentPane().add(textFieldStreet);
			textFieldStreet.setColumns(10);
			
			textFieldCity = new JTextField();
			textFieldCity.setBounds(349, 112, 127, 20);
			frame.getContentPane().add(textFieldCity);
			textFieldCity.setColumns(10);
			
			textFieldState = new JTextField();
			textFieldState.setBounds(349, 147, 127, 20);
			frame.getContentPane().add(textFieldState);
			textFieldState.setColumns(10);
			
			textFieldZipcode = new JTextField();
			textFieldZipcode.setBounds(349, 188, 127, 20);
			frame.getContentPane().add(textFieldZipcode);
			textFieldZipcode.setColumns(10);
			
			JLabel lblOrder = new JLabel("Order");
			lblOrder.setBounds(639, 35, 46, 14);
			frame.getContentPane().add(lblOrder);
			
			JLabel lblItem = new JLabel("Item");
			lblItem.setBounds(584, 74, 46, 14);
			frame.getContentPane().add(lblItem);
			
			JLabel lblQuantity = new JLabel("Quantity");
			lblQuantity.setBounds(584, 112, 46, 14);
			frame.getContentPane().add(lblQuantity);
			
			JLabel lblUserId = new JLabel("User ID");
			lblUserId.setBounds(584, 150, 46, 14);
			frame.getContentPane().add(lblUserId);
			
			JLabel lblCost = new JLabel("Cost");
			lblCost.setBounds(584, 191, 46, 14);
			frame.getContentPane().add(lblCost);
			
			textFieldItem = new JTextField();
			textFieldItem.setBounds(625, 71, 120, 20);
			frame.getContentPane().add(textFieldItem);
			textFieldItem.setColumns(10);
			
			textFieldQuantity= new JTextField();
			textFieldQuantity.setBounds(625, 109, 120, 20);
			frame.getContentPane().add(textFieldQuantity);
			textFieldQuantity.setColumns(10);
			
			textFieldUserID = new JTextField();
			textFieldUserID.setBounds(625, 147, 120, 20);
			frame.getContentPane().add(textFieldUserID);
			textFieldUserID.setColumns(10);
			
			textFieldCost = new JTextField();
			textFieldCost.setBounds(623, 188, 122, 20);
			frame.getContentPane().add(textFieldCost);
			textFieldCost.setColumns(10);
		
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				
			// Store Users, Addresses, and Orders information for later use.
				public void actionPerformed(ActionEvent e) {
					
					l.store(user, address, order);
					
				// User's info
				String firstName = textFieldFirstName.getText().toString();
				String lastName = textFieldLastName.getText().toString();
				String email = textFieldEmail.getText().toString();
				String password = textFieldPassword.getText().toString();
				user.setUser(firstName, lastName, email, password, address);
				
				// Address info
				String street= textFieldStreet.getText().toString();
				String city = textFieldCity.getText().toString();
				String State = textFieldState.getText().toString();
				String zipcode = textFieldZipcode.getText().toString();
				address.setAddress(street, city, State, zipcode);
				
				// Order info
				String item = textFieldItem.getText().toString();
				String quantity = textFieldQuantity.getText().toString();
				String userID = textFieldUserID.getText().toString();
				String cost = textFieldCost.getText().toString();
				order.setOrder(item, quantity, userID, cost, address, user);		
				
				}	
			
		});
			btnSave.setBounds(171, 297, 89, 23);
			frame.getContentPane().add(btnSave);
	
			JButton btnLoad = new JButton("Load");
			btnLoad.addActionListener(new ActionListener() {
			
				// load the informations from each classes and show it on UI
				
			public void actionPerformed(ActionEvent e) {
				
				l.load();
				
				System.out.println("User's firstName: " + user.getFirstName());
				System.out.println("User's lastName: " + user.getLastName());
				System.out.println("User's e-mail: " + user.getEmail());
				System.out.println("User's password: " + user.getPassword());
				System.out.println("User's address: " + user.address());
				System.out.println();
				System.out.println("Street: " + address.getStreet());
				System.out.println("City: " + address.getCity());
				System.out.println("State: " + address.getState());
				System.out.println("Zipcode: " + address.getZipcode());
				System.out.println();
				System.out.println(" User's Order Item: " + order.getItem());
				System.out.println(" User's Order Quantity: " + order.getQuanity());
				System.out.println(" User's UserID: " + order.getUserID());
				System.out.println(" User's shipping Address: " + order.shippingAddress());
				System.out.println(" User's Orders Cost: " + order.getCost());
			}	
				
			});
			
			btnLoad.setBounds(561, 297, 89, 23);
			frame.getContentPane().add(btnLoad);	
		}
	}
