package Day_23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("temp1.txt");
		fw.write("Java is a high-level, object-oriented programming language known for its platform independent");
		fw.close();
	}

}
