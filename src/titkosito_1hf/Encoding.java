package titkosito_1hf;

import java.io.IOException;

public class Encoding {

	public static void main(String[] args) throws IOException {
		IOHandler ioHandler;
		Encoder encoder = new Encoder();
		String[] encodedString = new String[100];

		ioHandler = new IOHandler("datas.txt");
		ioHandler.processInput();

		encodedString = encoder.stringArrayToEncode(ioHandler.getInput(), 'e', 'i');

		ioHandler.writeOutput(encodedString, true);
	}

}
