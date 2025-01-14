package com.org;
import java.util.Scanner;
public class Simple_if {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter value a");
		
		int a =sc.nextInt();
		
		
		if( a>10) {
			
			System.out.println("a is greater than 10");
		}
		
		else {
			System.out.println("a is not greater than 10");
		}
		
	}

}
