package com.org;

import java.util.Scanner;

public class Addition_Array {

	public static void main(String[] args) {
		
		int[] arr1= new int[3];
		int[] arr2= new int[3];
		int[] arr3= new int[3];
	
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter values of array 1");
 
 for(int i=0; i<arr1.length; i++) {
	 
	 arr1[i] =sc.nextInt();
 }
 
 System.out.println("Enter values of array 2");
 
 for(int i=0; i<arr2.length; i++) {
	 
	 arr2[i] =sc.nextInt();
 }
 
for(int i=0; i<arr3.length; i++) {
	 
	 arr3[i] =arr1[i]+arr2[i];
 }
for(int i=0; i<arr3.length; i++) {
	 
	System.out.print(arr3[i] +" \t ");
 }


	}
 
}
