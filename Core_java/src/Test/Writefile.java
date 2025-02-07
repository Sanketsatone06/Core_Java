package Test;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("Hello");
		fw.close();
	}

}
