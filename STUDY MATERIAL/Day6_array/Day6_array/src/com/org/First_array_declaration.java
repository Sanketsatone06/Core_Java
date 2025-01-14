package com.org;

public class First_array_declaration {

	public static void main(String[] args) {
		
//		int[] arr1= new int[5];
//		
//		arr1[0] =10;
//		arr1[1] =20;
//		arr1[2] =30;
//		arr1[3] =40;
//		arr1[4] =50;
//		System.out.println(arr1[4]);
		
		
		System.out.print("[");
		int [] arr2= {1,2,3,4};
		
	for(int i=0; i<arr2.length; i++) {
		
		System.out.print(arr2[i] +"\t ");
	}
	System.out.print("]");

	}

}
