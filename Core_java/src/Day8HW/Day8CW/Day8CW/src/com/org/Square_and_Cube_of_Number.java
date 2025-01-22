package com.org;

import java.util.Scanner;

public class Square_and_Cube_of_Number {
	
	public static double square(int num) {
		return num * num;
	}
	
	public static double cube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number to get Square and Cube : ");
		int n=sc.nextInt();
		
		double squareNum = square(n);
		double cubeNum = cube(n);
		
		System.out.println("Square of A Number = " +squareNum);
		System.out.println("Cube of a Number = " +cubeNum);

	}

}
