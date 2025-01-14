package com.org;

import java.util.Scanner;

public class ScannerUse {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name=sc.nextLine();
		
		System.out.println("my name is "+name);
		
		
		System.out.println("Enter value a");
		int a =sc.nextInt();
		
		System.out.println("value a ="+a);
		
		System.out.println("Enter your b");
		
		int b=sc.nextInt();
		
		System.out.println("value b ="+b);
		
		int sum= a+b;
		
		System.out.println("sum of no is "+sum);
		
		

	}

}
