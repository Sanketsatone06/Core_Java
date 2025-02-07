package Test;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		
		File file = new File("data.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			System.out.println("not created");
			e.printStackTrace();
		}

	}

}
