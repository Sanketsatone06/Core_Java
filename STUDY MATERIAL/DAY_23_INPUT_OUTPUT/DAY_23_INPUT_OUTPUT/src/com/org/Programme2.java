package com.org;

import java.io.FileWriter;
import java.io.IOException;

public class Programme2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("file1.txt");
		fw.write("java is plateform independent language");
		fw.close();

	}

}
