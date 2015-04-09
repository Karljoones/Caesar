package ie;

public class Cipher {
	
	// Method to encode the data
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
	
	// Method to decode the data
	public static String decode(String encodedStr, int Key) {
		return encode(encodedStr, 25 - Key);
	}
}
