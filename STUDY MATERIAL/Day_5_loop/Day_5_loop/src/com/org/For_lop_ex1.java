package com.org;

import java.util.Scanner;

public class For_lop_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a no for table");

		int num=sc.nextInt();
		
		for(int i =1; i<=10; i++) {
			
			System.out.println(num*i);
		}

	}

}
