package com.org;

import java.util.Scanner;

public class Positive_or_Negative {
	
	public static void number(int a) {
		if ( a > 0) {
			System.out.println("Number is Positive");
		} else if ( a < 0 ) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int integer = sc.nextInt();
		
		number(integer);

	}

}
