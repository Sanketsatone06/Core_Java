package Day_23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader file = new FileReader("temp1.txt");
			
			int i;
			
			while((i=file.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
