package com.org;

import java.util.Scanner;

public class Two_D_ArrayEx {

	public static void main(String[] args) {
		
		int[] []arr = new int[3] [2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0; i<3; i++)
		{
			
	for(int j=0; j<2; j++) {
				
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0; i<3; i++)
		{
			
			for(int j=0; j<2; j++) {
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
	
	}

}
