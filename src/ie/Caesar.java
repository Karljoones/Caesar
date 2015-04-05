package ie;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	public static void main(String[] args) {
		
		// Get the user to enter in the string and the key they want to use
		System.out.println("Please enter the string you want to encrypt:\n");			// get string
		System.out.println("Please enter the key you want to excrypt \"%s\" with:\n");	// get key
	} // End main
	
	// This method is to encrypt the string with the chosen key
	public String encrypt(String original, Integer key) {
		String encrypted = "World";
		
		return encrypted;
	} // End encrypt()
	
	// This method is to decrypt the string with the chosen key, only works if
	public String decrypt(String encrypted, Integer key) {
		String decrypted = "Hello";
		
		return decrypted;
	} // End decrypt()
} // End of class