package ie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	
	// Values assigned as examples, re-assigned when user inputs.
	private static String original = "The quick brown fox jumped over the lazy dog";
	private static String key = "12";
	
	public static void main(String[] args) {
	
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
//		
//		// Print out the encoded data and the original message under
//		System.out.println("Your encoded string is: " + Cipher.removeSpaces(Cipher.encode(Caesar.getOriginal(), Key)));
//		System.out.println("Your original string was: " + Cipher.decode(Cipher.encode(Caesar.getOriginal(), Key), Key));

//		GUI gridBagFrame = new GUI();
//		gridBagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		gridBagFrame.setSize(300,150);
//		gridBagFrame.setVisible(true);
		
		Caesar.setOriginal(JOptionPane.showInputDialog("Enter the string to encode:"));
		Caesar.setKey(JOptionPane.showInputDialog("Enter the key to encode:"));
		JOptionPane.showMessageDialog(null, Cipher.removeSpaces(Cipher.encode(Caesar.getOriginal(), Caesar.changeKey(Caesar.getKey()))), "Encoded", JOptionPane.PLAIN_MESSAGE);
		
	} // End main
	
	// Accessors
	// Accessor for the message that they want to encrypt
	public static void setOriginal(String message) {
		original = message;
	} 
	public static String getOriginal(){
		return original;
	}
	// Accessor for the key they want to encrypt the message with
	public static void setKey(String offset) {
		key = offset;
	}
	public static String getKey(){
		return key;
	}
	
	public static int changeKey(String key) {
		int Key = 0;
		try {
			Key = Integer.parseInt(Caesar.getKey());
		} catch (NumberFormatException e) {
			System.out.println("IO error in format of number.");
			System.exit(1);
		}
		return Key;
	}
	
} // End of class