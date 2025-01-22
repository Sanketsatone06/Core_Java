package day_8_Homework;

import java.util.Scanner;

	public class Circumference_of_Circle {
	
	public static void circumference( int r ) {
		System.out.println( "Circumference of Circle = " +2 * 3.14 *r);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius : ");
		int r=sc.nextInt();
		
		circumference(r);
		

	}

}
