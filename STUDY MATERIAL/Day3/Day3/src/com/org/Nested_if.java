package com.org;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		System.out.println("Enter your income");
		
		int income=sc.nextInt();
		
		if(marks>75) {
			if(income<50000) 
			{
				
				System.out.println("You are eligible for scholarship");
			}
			
			else {
				
				System.out.println("your income is more");
			}
		
		}
		
		else {
			
			System.out.println("you are not eligible for  scholarship");
		}
		

	}

}
