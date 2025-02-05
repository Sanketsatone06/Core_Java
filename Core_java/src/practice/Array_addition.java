package practice;

import java.util.Scanner;

public class Array_addition {

	public static void main(String[] args) {
		
		int [] arr1 = new int [3];
		int [] arr2 = new int [3];
		int [] arr3 = new int [3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of 1st Array");
		
		for(int i = 0;i<arr1.length;i++) {
			arr1 [i] =  sc.nextInt();
		}
		
		System.out.println("Enter value of 2nd Array");
		for(int i = 0;i<arr2.length;i++) {
			arr2 [i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr3.length;i++) {
			arr3 [i] = arr1[i] + arr2[i];
		}
		
		System.out.println("Sum of two arrays");
		for(int i =0 ; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}

}
