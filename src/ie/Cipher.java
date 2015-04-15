package ie;

/* This program is used to encrypt and decrypt using the caesar shift algorithm
 * Began: 23 March 2015
 * Copyright Karl Jones
 */

public class Cipher {
	
	/* Method to encode the data
	   This method get the key inputed and shifts the characters in the string up by the key.
	   It then appends the characters onto the end of a new string which is the encoded.
	*/   
	public static String encode(String original, int Key){
		
		// This ensures that the key is mot above 26, has to be between 0 and 25 in order to be included in the alphabet. It takes the remainer
		Key = Key % 26 + 26;
		
		StringBuilder encoded = new StringBuilder();
		
		for ( char i : original.toCharArray() ) {
			
			// This checks if the letter is the same or not.
			if ( Character.isLetter(i) ) {
				
				// This if else determines if the letter is upper case or if it is lower case.
				// It then adds the character to the end of the encoded string.
				// This also removes the uppercase characters from the output.
				if( Character.isUpperCase(i) ) {
					
					encoded.append( (char) ('a' + ( i - 'a' + Key ) % 26 ) );
					
				} else {
					
					encoded.append( (char) ('a' + ( i - 'a' + Key ) % 26 ) );
					
				}
				
			} else {
				
				encoded.append(i);
				
			} 
			
		} // End for
		
		// This changes the StringBuilder into a string and returns it
		return encoded.toString();
		
	} // End encode
	
	// This method re-encodes the string but with the key corresponding to what is needed to decode the message, this isnt currently used.
	public static String decode(String encodedStr, int Key) {
		
		return encode(encodedStr, 26 - Key);
		
	} // End decode()
	
	// This method removes the blank spaces from the strings
	// The reason for this is that it makes the string more secure
	// And harder to crack the code.
	public static String removeSpaces(String enc) {
		
		String removed;
		
		removed = enc.replaceAll("\\s", "");						// remove the spaces from the string
		removed = removed.replaceAll("[^\\w\\s]","");				// remove the special characters from the string
		
		return removed;
		
	} // End removeSpaces()
	
} // End class
