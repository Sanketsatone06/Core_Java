package com.org;

import java.util.Scanner;

public class Area_of_Circle {
	
	public static double ar_cc(float r) {
		return 3.14 * r * r ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius : ");
		float r=sc.nextFloat();
		
		double Avg = ar_cc(r);
		
		System.out.println("Area of Circle is = " +Avg);
	}

}
