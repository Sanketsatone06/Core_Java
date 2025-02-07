package com.org;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programme3 {
public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr= new FileReader("file1.txt");
			int i;
			
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
