package Day_23;

import java.io.File;

public class Delet {

	public static void main(String[] args) {

		File file = new File("temp1.txt");
		file.delete();
		System.out.println(file + "file deleted");
		

	}

}
