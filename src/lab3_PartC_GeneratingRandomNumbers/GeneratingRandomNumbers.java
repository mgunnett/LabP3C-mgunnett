package lab3_PartC_GeneratingRandomNumbers;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/*
 * Example of using the Random class from the java.util package for integer generation.
 * 
 * @author Megan E. Gunnett
 * @version 1.0 - 4 February 2025
 * */

public class GeneratingRandomNumbers {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratingRandomNumbers window = new GeneratingRandomNumbers();
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
	public GeneratingRandomNumbers() {
		initialize();
		Random rnd = new Random();
		int die1;
		int die2;
		
		// show the user five rolls of the dice
		for (int roll = 1; roll <= 5; roll++) {
			die1 = rnd.nextInt(6) + 1;
			die2 = rnd.nextInt(6) + 1;
			
			String title = "Roll #" + roll + " of 5";
			String result = "<HTML>You have rolled a " + die1 + " and a " + die2
					+ "<br>Total is " + (die1 + die2);
			
			JOptionPane.showMessageDialog(null, result, title, JOptionPane.PLAIN_MESSAGE);;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
