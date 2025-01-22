package com.org;

import java.util.Scanner;

public class Perimeter_of_Rectangle {
	
	public static int perofRect(int L, int W) {
		return ( L + W ) * 2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		int L = sc.nextInt();
		
		System.out.println("Enter Breadth : ");
		int W = sc.nextInt();
		
		
		
		System.out.println(" \t Perimeter of Rectangle = " +perofRect( L, W ));

	}

}
