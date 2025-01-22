package com.org;

import java.util.Scanner;

public class Greater_No_Between_2_Num {
	
	public static void number (int A,int B) {
		
		if ( A > B ) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is Greater than A");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of A : ");
		int A = sc.nextInt();
		
		System.out.println("Enter Value of B : ");
		int B = sc.nextInt();
		
		number(A,B);
		

	}

}
