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
	private String[] input = new String[100];

	public IOHandler(String inputFileName) throws IOException  {
		this.inFile = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName), "UTF-8"));
		this.processInput();
	}

	public String[] getInput() {
		return this.input;
	}

	public void writeOutput(String[] encodedValue, boolean toFile) throws FileNotFoundException, UnsupportedEncodingException {
		if (toFile) {
			PrintWriter writer = new PrintWriter("encodedDatas.txt", "UTF-8");
			int i = 0;
			writer.println("// A kódolt szöveg a vonal alatt található!");
			writer.println("// ---------------");
			while (encodedValue[i] != null) {
				writer.println(encodedValue[i]);
				i++;
			}
			writer.close();
		} else {
			int i = 0;
			while (encodedValue[i] != null) {
				System.out.println(encodedValue[i]);
				i++;
			}
		}
	}

	private void processInput() throws IOException {
		String line = "";
		int i = 0;
		while ((line = this.inFile.readLine()) != null) {
			this.input[i] = line;
			i++;
		}

		this.inFile.close();
	}
}
