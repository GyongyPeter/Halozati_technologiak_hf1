package titkosito_1hf;

public class Encoder {
	
	public Encoder() {
		
	}

	public String stringToEncode(String value, char encodeThis, char encodedKey) {
		return value.replace(encodeThis, encodedKey);
	}
	
	public String stringToEncode2(String value) {
		int s = (int)value.charAt(0);
		s++;

		return value.replace(value.charAt(0), Character.toString((char)s).charAt(0));
	}


}
