package com.org;

import java.util.Scanner;

public class Merge_Array {

	public static void main(String[] args) {
		
		int[] arr1= new int[3];
		int[] arr2= new int[2];
		
		int[] arr3= new int [arr1.length+arr2.length];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value array1 ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		
		System.out.println("enter value array2");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+"\t");
	
		}
		
		System.out.println();
		
		for(int i=0; i<arr1.length; i++)
		{
			
			arr3[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++)
		{
			
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println("merge array");
		
		for(int i=0; i<arr3.length; i++)
		{
			
		System.out.print(arr3[i] +"\t");
		}
		
	}

}
