package titkosito_1hf;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IOHandler {

	private BufferedReader inFile;
	private String input = "";

	public IOHandler(String inputFileName) throws IOException  {
		this.inFile = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName), "UTF-8"));
		this.processInput();
	}

	public String getInput() {
		return this.input;
	}

	public void writeOutput(String encodedValue, boolean toFile) throws FileNotFoundException, UnsupportedEncodingException {
		if (toFile) {
			PrintWriter writer = new PrintWriter("encodedDatas.txt", "UTF-8");
			
			writer.println("// A kódolt szöveg a vonal alatt található!");
			writer.println("// ---------------");
			for (int i = 0; i < encodedValue.length(); i++) {
				if (encodedValue.charAt(i) == '\n') {
					writer.println();
				} else {
					writer.print(encodedValue.charAt(i));
				}
			}
			writer.close();
		} else {
			for (int i = 0; i < encodedValue.length(); i++) {
				if (encodedValue.charAt(i) == '\n') {
					System.out.println();
				} else {
					System.out.print(encodedValue.charAt(i));
				}
			}
		}
	}

	private void processInput() throws IOException {
		String line = "";
		while ((line = this.inFile.readLine()) != null) {
			this.input += line + '\n';
		}

		this.inFile.close();
	}
}
