package titkosito_1hf;

import java.io.IOException;

public class Encoding {

	public static void main(String[] args) throws IOException {
		IOHandler ioHandler;
		Encoder encoder = new Encoder();
		String encodedString = "";

		ioHandler = new IOHandler("datas.txt");
		
		encodedString = encoder.stringToEncode(ioHandler.getInput());

		// encodedString = encoder.stringToEncode(ioHandler.getInput(), 'e', 'i');

		ioHandler.writeOutput(encodedString, true);
	}

}
