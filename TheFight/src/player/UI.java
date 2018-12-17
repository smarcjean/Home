package player;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {
	Game g = new Game();
	Main m = new Main();

	private JFrame frame;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("");
	private JButton btnResults;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 26, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				textField.setText("");
				System.out.println(textField.getText());
				
				
			}
		});
		btnNewButton.setBounds(53, 167, 120, 31);
		frame.getContentPane().add(btnNewButton);
		
		btnResults = new JButton("Results");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				
				System.out.println("questions");
				System.out.println(textField.getText());
			}
		});
		btnResults.setBounds(250, 185, 89, 23);
		frame.getContentPane().add(btnResults);
	}
}
