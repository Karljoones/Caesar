package ie;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JOptionPane;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	
	// Values to store the strings
	private static String original;
	private static String key;
	
	public static void main(String[] args) {
		
		// The below code can be used in the command line for a command line version of the program, 
		// this is disabled in favour of the interface that is presented to the user.
		
//		// Get the user to enter in the string and the key they want to use
//		System.out.println("Please enter the string you want to encrypt:\n");			// get string
//		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			Caesar.setOriginal(str.readLine());
//		} catch (IOException e) {
//			System.out.println("IO error trying to read in string.");
//			System.exit(1);
//		}
//		
//		// Get the offset that the user wants to offset the string with
//		System.out.println("Please enter the key you want to encrypt \"" + Caesar.getOriginal() + "\" with:\n");	// get key
//		BufferedReader ky = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			Caesar.setKey(ky.readLine());
//		} catch (IOException e) {
//			System.out.println("IO error trying to read in key.");
//			System.exit(1);
//		}
//		
//		int Key = 0;
//		
//		// Convert the String key into an integer Key.
//		try {
//			Key = Integer.parseInt(Caesar.getKey());
//		} catch (NumberFormatException e) {
//			System.out.println("IO error in format of number.");
//			System.exit(1);
//		}
		

		// Give the user information on how to use the program
		JOptionPane.showMessageDialog(null, "Welcome!"
				+ "\nTo encode, enter the string and then you will be asked for the key."
				+ "\nTo decode, enter the encoded string, simply take your key away from 26 to decode the message."
				+ "\nPlease note: this does not work with numerical values."
				+ "\nTo exit, simply type \"exit\".", 
				"How to use the program", 
				JOptionPane.PLAIN_MESSAGE);
		
		// Get the user inputs
		Caesar.setOriginal(JOptionPane.showInputDialog("Enter the string you want to encode:"));
		
		// This code is used as an escape for the user, typing exit into the window exits the program.
		if(Caesar.getOriginal().equals("exit") || Caesar.getOriginal().equals("Exit") || Caesar.getOriginal().equals("EXIT")) {
			System.exit(1);
		}
		Caesar.setKey(JOptionPane.showInputDialog("Enter the key to encode / decode:"));
		
		// This code is used as an escape for the user, typing exit into the window exits the program.
		if(Caesar.getKey().equals("exit") || Caesar.getKey().equals("Exit") || Caesar.getKey().equals("EXIT")){
			System.exit(1);
		}
		
		// This code copies the encoded string into the clipboard so that the user can paste it, or reopen the program and paste it back in (used for decoding the message)
		// The sequence of things is that the original is gotten, encoded then sent to get anything that is not a character removed.
		StringSelection stringSelection = new StringSelection(Cipher.removeSpaces(Cipher.encode(Caesar.getOriginal(), 
				Caesar.changeKey(Caesar.getKey()))));
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
		
		// Show the user the output and inform them of the text that was copied to the clipboard and what the decoding key is.
		JOptionPane.showMessageDialog(null, 
				Cipher.removeSpaces(Cipher.encode(Caesar.getOriginal(), Caesar.changeKey(Caesar.getKey()))) 
				+ "\nThis has been copied into your clipboard."
				+ "\nYour decoding key is: " + (26 - Caesar.changeKey(Caesar.getKey())
				+ "\nYour encoding key is: " + Caesar.changeKey(Caesar.getKey())), 
				"Encoded", 
				JOptionPane.PLAIN_MESSAGE);
		
		// Print out the encoded data and the original message under after the program has ended
		System.out.println("Your encoded string is: " 
				+ Cipher.removeSpaces(Cipher.encode(Caesar.getOriginal(), 
				Caesar.changeKey(Caesar.getKey()))));
		System.out.println("Your original string was: " 
					+ Cipher.decode(Cipher.encode(Caesar.getOriginal(), 
					Caesar.changeKey(Caesar.getKey())), 
					Caesar.changeKey(Caesar.getKey())));
		System.out.println("Your decoding key is: " + (26 - Caesar.changeKey(Caesar.getKey())));
		System.out.println("Your encoding key is: " + Caesar.changeKey(Caesar.getKey()));
	} // End main
	
	// This is used to change the key from a string to an int
	public static int changeKey(String key) {
		int Key = 0;
		// try to change the string into an integer, if it does not work, give the exception.
		try {
			Key = Integer.parseInt(Caesar.getKey());
		} catch (NumberFormatException e) {
			System.out.println("IO error in the format of the number, please make sure it is between 0-9");
			System.exit(1);				// End the program
		}
		return Key;
	} // End changeKey()
	
	// Accessors
	// Accessor for the original message
	public static void setOriginal(String message) {
		original = message;
	} 
	public static String getOriginal(){
		return original;
	}
	// Accessor for the key they want to encode the message with
	public static void setKey(String offset) {
		key = offset;
	}
	public static String getKey(){
		return key;
	}
	// End of accessors
	
} // End of class
