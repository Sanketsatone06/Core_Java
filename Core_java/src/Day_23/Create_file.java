package Day_23;

import java.io.File;
import java.io.IOException;

public class Create_file {

	public static void main(String[] args) {
		
	File file = new File("temp1.txt");
	
	try {
		file.createNewFile();
		System.out.println("File is created");
	} catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("not created");
	}
	}

}
