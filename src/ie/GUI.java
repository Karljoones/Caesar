package ie;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

// This class is in control of the user interface.
public class GUI extends JFrame{
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	// set up the GUI
	public GridBagLayout() {
		super("Caesar");
		setLayout(layout);
		constraints = new GridBagConstraints();
		
		// Create components
		JTextArea textArea1 = new JTextArea("Input", 5, 10);
		JTextArea textarea2 = new JTextArea("Output", 2, 2);
		
		String[] keys = {"1", "2", "3", "4"};
		
	} // End constructor
}
