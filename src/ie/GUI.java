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
	private static final long serialVersionUID = 1L;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	// set up the GUI
	public GUI() {
		super("Caesar");
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		
		// Create components for the interface
		JTextArea textArea1 = new JTextArea("Input", 5, 10);
		JTextArea textArea2 = new JTextArea(" ", 2, 2);
		
		String[] keys = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};
		JComboBox comboBox = new JComboBox(keys);
		
		JTextField textField = new JTextField("Output");
		
		JButton button1 = new JButton("Encode");
		JButton button2 = new JButton("Decode");
		JButton button3 = new JButton("Help");
		
		// Add text area 1
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(textArea1, 0, 0, 1, 3);
		
		// Add button 1
		constraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent(button1, 0, 1, 2, 1);
		
		// Add the combobox
		addComponent(comboBox, 2, 1, 2, 1);
		
		// Add button 2
		constraints.weightx = 1000;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(button2, 1, 1, 1, 1);
		
		// Add button 3
		constraints.weightx = 0;
		constraints.weighty = 0;
		addComponent(button3, 1, 2, 1, 1);
		
		// Add text field
		addComponent(textField, 3, 0, 2, 1);
		
		// Add text area 2
		addComponent(textArea2, 3, 2, 1, 1);
		
	} // End constructor
	
	private void addComponent(Component component, int row, int column, int width, int height) {
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints(component, constraints);
		add(component);
	} // End method
}
