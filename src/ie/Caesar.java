package ie;

import java.io.*;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	private static String original = "The quick brown fox jumped over the lazy dog";
	private static String key = "12";
	
	public static void main(String[] args) {
		
		// Get the user to enter in the string and the key they want to use
		System.out.println("Please enter the string you want to encrypt:\n");			// get string
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		try {
			Caesar.setOriginal(str.readLine());
		} catch (IOException ioe) {
			System.out.println("IO error trying to read in string.");
			System.exit(1);
		}
		
		// Get the offset that the user wants to offset the string with
		System.out.println("Please enter the key you want to encrypt \"" + Caesar.getOriginal() + "\" with:\n");	// get key
		BufferedReader ky = new BufferedReader(new InputStreamReader(System.in));
		try {
			Caesar.setKey(ky.readLine());
		} catch (IOException ioe) {
			System.out.println("IO error trying to read in key.");
			System.exit(1);
		}
		int Key = 0;
		
		try {
			Key = Integer.parseInt(Caesar.getKey());
		} catch (NumberFormatException e) {
			System.out.println("IO error in format of number.");
			System.exit(1);
		}
		
		// Print out the encoded data
		System.out.println(Cipher.encode(Caesar.getOriginal(), Key));
	} // End main
	
	// Accessors
	public static void setOriginal(String message) {
		original = message;
	}
	public static String getOriginal(){
		return original;
	}
	
	public static void setKey(String offset) {
		key = offset;
	}
	public static String getKey(){
		return key;
	}
} // End of class