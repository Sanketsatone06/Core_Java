package com.org;

import java.util.Scanner;

public class Sort_Asc {

	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" \t");
		}
		
		for(int i=0;i<arr.length-1;i++) {
			
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[minindex]>arr[j]) {
					minindex=j;
				}
			}
			
			int correct=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=correct;
		}
	
		
		
		System.out.println("sorted array");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] +"\t");
		}

	}
	
	

}
