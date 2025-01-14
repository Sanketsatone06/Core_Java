package com.org;

import java.util.Scanner;

public class Scanner_value_array {

	public static void main(String[] args) {
		
		int [] arr1= new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of array 1");
		
		for(int i=0; i<arr1.length; i++) 
		
		{
			arr1[i]=sc.nextInt();
//			System.out.println("values of array  =" +arr1[i] +"\t");
			
		}
		
		for(int i=0; i<arr1.length; i++) 
			
		{
			System.out.print(arr1[i] +"\t");
			
		}

	}

}
