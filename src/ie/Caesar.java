package ie;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	public static void main(String[] args) {
		
		String original;
		String key;
		
		// Get the user to enter in the string and the key they want to use
		System.out.println("Please enter the string you want to encrypt:\n");			// get string
		System.out.println("Please enter the key you want to excrypt \"%s\" with:\n");	// get key
		System.out.println(Cipher.encode(original, key));
	} // End main
	
} // End of class