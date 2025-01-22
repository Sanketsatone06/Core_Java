package day_8_Homework;

import java.util.Scanner;

public class Arithmatic_Operation {
	
	public static double addition ( double a, double b) {
		return a + b;
	}
	public static double subtraction ( double a, double b) {
		return a - b;
	}
	public static double multiplication ( double a, double b) {
		return a * b;
	}
	public static double division ( double a, double b) {
		
		return a / b;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		double a=sc.nextDouble();
		
		System.out.println("Enter Number 2 : ");
		double b=sc.nextDouble();
		
		System.out.println("Addition of 2 Numbers = " +addition( a,b ));
		System.out.println("Subtraction of 2 Numbers = " +subtraction( a,b ));
		System.out.println("Multiplication of 2 Numbers = " +multiplication( a,b ));
		if ( b == 0) {
			System.out.println("B is cannot be zero");
		} else {
			System.out.println("Division of 2 numbers = " +division( a,b ));
		}
	}

}
