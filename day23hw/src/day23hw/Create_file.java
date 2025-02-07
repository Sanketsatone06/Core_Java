package day23hw;

import java.io.File;
import java.io.IOException;

public class Create_file {
	
	public class Create_file1 {

		public static void main(String[] args) {
			
		File file = new File("file1.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is created");
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("not created");
		}
		}

	}


}
