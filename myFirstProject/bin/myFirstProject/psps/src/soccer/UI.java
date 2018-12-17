package soccer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class UI {
	Game g = new Game();
	Main m = new Main();
	

	private JFrame frame;
	private JTextField textFieldQuestion;
	private final JButton btnNewButton = new JButton("Game");
	private JButton btnResults;
	private JLabel lblQuestions;
	private JLabel lblAnswers;
	private JTextField textFieldAnswer;
	private JLabel lblQuestionIs;
	private JLabel lblAnswerIs;

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
		frame.setBounds(100, 100, 666, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldQuestion = new JTextField();
		textFieldQuestion.setBounds(94, 64, 245, 20);
		frame.getContentPane().add(textFieldQuestion);
		textFieldQuestion.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				textFieldQuestion.setText("");
				System.out.println(textFieldQuestion.getText());
				
				
			}
		});
		btnNewButton.setBounds(53, 185, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnResults = new JButton("Results");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main m = new Main();
				
				System.out.println("");
			
			}
		});
		btnResults.setBounds(250, 185, 89, 23);
		frame.getContentPane().add(btnResults);
		
		lblQuestions = new JLabel("Questions");
		lblQuestions.setBounds(43, 21, 80, 14);
		frame.getContentPane().add(lblQuestions);
		
		lblAnswers = new JLabel("Answers");
		lblAnswers.setBounds(482, 21, 46, 14);
		frame.getContentPane().add(lblAnswers);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(445, 64, 116, 20);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		lblQuestionIs = new JLabel("Question is");
		lblQuestionIs.setBounds(25, 67, 59, 14);
		frame.getContentPane().add(lblQuestionIs);
		
		lblAnswerIs = new JLabel("Answer is");
		lblAnswerIs.setBounds(393, 67, 46, 14);
		frame.getContentPane().add(lblAnswerIs);
	}
}
