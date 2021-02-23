package titkosito_1hf;

import java.io.IOException;

public class Encoding {

	public static void main(String[] args) throws IOException {
		IOHandler ioHandler;
		Encoder encoder = new Encoder();
		String encodedString = "";

		ioHandler = new IOHandler("datas.txt");
		
		// SOLUTION 1
		// Replace all character (which is same as the first character) to ASCII number+1 of first character.
		encodedString = encoder.stringToEncode2(ioHandler.getInput());
		
		// SOLUTION 2
		// Replace the given characters to given character
		// encodedString = encoder.stringToEncode(ioHandler.getInput(), 'e', 'i');

		ioHandler.writeOutput(encodedString, false);
	}

}
