package com.org;

import java.util.Scanner;

public class WithoutstaticExample {
	
	public void printname(String name) {
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your name");
//		String name=sc.nextLine();
		 System.out.println("my Name is ="+name);
		
	}

	public static void main(String[] args) {
		WithoutstaticExample sp=new WithoutstaticExample();
		
		sp.printname("Priyanka");

	}

}
