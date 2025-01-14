package com.org;

import java.util.Scanner;

public class Find_square_array {

	public static void main(String[] args) {
	
		int[] arr1=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		
		for(int i=0; i<arr1.length; i++) {
			
			arr1[i] = sc.nextInt();
		}
		
     for(int i=0; i<arr1.length; i++) {
			
			arr1[i] =arr1[i]*arr1[i];
			
			System.out.println(arr1[i]+"\t ");
		}
		

	}

}
