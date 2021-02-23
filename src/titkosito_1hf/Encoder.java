package titkosito_1hf;

public class Encoder {
	
	public Encoder() {
		
	}

	// Replace the given characters to given character
	public String stringToEncode(String value, char encodeThis, char encodedKey) {
		return value.replace(encodeThis, encodedKey);
	}
	
	public String stringToEncode(String value) {
		char[] newValue = value.toCharArray();
		for (int i = 0; i < newValue.length; i++) {
			if (newValue[i] != '\n') {
				int c = (int)newValue[i];
				c++;
				newValue[i]= (char)c;
			}
		}

		return String.valueOf(newValue);
	}
}
