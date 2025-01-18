package com.org;

import java.util.Scanner;

public class Min_array_find {

	public static void main(String[] args) {
		int [] arr=new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value array1 ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				
				min=arr[i];
			}
			
		}
		System.out.println("min is "+min);
	}

}
