package com.org;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age 1 to 79");
		
		int age=sc.nextInt();
		
		if(age<12) {
			
			System.out.println("You are a child");
		}
		
		else if(age<18) {
			System.out.println("You are a teenager");
		}
		
		else if(age<50) {
			System.out.println("you are eligible for vote");
		}
		
		else if(age<80) {
			System.out.println("you are older");
		}
		
		else {
			
			System.out.println("else condition");
		}

	}

}
