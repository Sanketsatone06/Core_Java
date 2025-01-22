package day_8_Homework;

import java.util.Scanner;

import com.org.Area_of_Triangle;

public class Area_of_Triangle {
	
	public static void aotri(double breadth, double height) {
		System.out.println(0.5*breadth*height);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Breadth");
		double breadth=sc.nextDouble();
		
		System.out.println("Enter Height");
		double height=sc.nextDouble();
		
		Area_of_Triangle a = new Area_of_Triangle();
		
		a.aotri(breadth, height);

	}

}
