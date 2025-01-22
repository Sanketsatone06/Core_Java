package com.org;

import java.util.Scanner;

public class Perimeter_of_Triangle {
	
	public static int PerioTri(int a, int b, int c) {
		
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		
		System.out.println("Enter c : ");
		int c=sc.nextInt();
		
		int pot = PerioTri(a,b,c);
		
		System.out.println("Perimeter of Triangle = " +pot);

	}

}
