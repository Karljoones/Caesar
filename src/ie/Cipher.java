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
		Key = Key % 26 + 26;
		
		StringBuilder encoded = new StringBuilder();
		
		for ( char i : original.toCharArray() ) {
			if ( Character.isLetter(i) ) {
				if( Character.isUpperCase(i) ) {
					encoded.append( (char) ('A' + ( i - 'A' + Key ) % 26 ) );
				} else {
					encoded.append( (char) ('a' + ( i - 'a' + Key ) % 26 ) );
				}
			} else {
				encoded.append(i);
			}
		}
		return encoded.toString();
	}
	
	// Method to decode the data, basically encodes the string in the opposite order
	public static String decode(String encodedStr, int Key) {
		return encode(encodedStr, 26 - Key);
	}
	
	// This method is used to remove the spaces from the encoded string, making it more secure.
	public static String removeSpaces(String enc) {
		String removed;
		
		removed = enc.replaceAll("\\s", "");
		
		return removed;
	}
}
