package titkosito_1hf;

public class Encoder {
	
	public Encoder() {
		
	}

	public String[] stringArrayToEncode(String[] value, char encodeThis, char encodedKey) {
		int i = 0;
		String[] encodedValue = new String[100];
		while (value[i] != null) {
			encodedValue[i] = value[i].replace(encodeThis, encodedKey);
			i++;
		}
		
		return encodedValue;
	}

}
