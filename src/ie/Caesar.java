package ie;

import java.io.*;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Caesar {
	public static void main(String[] args) {
		
		// Values used for example only.
		String original = "The quick brown fox Jumped over the lazy dog";
		String key = "14";
		
		// Get the user to enter in the string and the key they want to use
		System.out.println("Please enter the string you want to encrypt:\n");			// get string
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		try {
			original = str.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read in string.");
			System.exit(1);
		}
		
		// Get the offset that the user wants to offset the string with
		System.out.println("Please enter the key you want to encrypt \"" + original + "\" with:\n");	// get key
		BufferedReader ky = new BufferedReader(new InputStreamReader(System.in));
		try {
			key = ky.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read in key.");
			System.exit(1);
		}
		
		System.out.println(Cipher.encode(original, key));
	} // End main
	
} // End of class