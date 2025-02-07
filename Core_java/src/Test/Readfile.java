package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new  FileReader("data.txt");
			int i;
			
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
