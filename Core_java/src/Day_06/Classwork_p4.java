package Day_06;

import java.util.Scanner;

public class Classwork_p4 {

	public static void main(String[] args) {
		
		int [] arr1 = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		
		for(int i = 0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			
//			 Write a program to store squares of the elements in another arrays and Display all the three arrays.
		}
		for(int i = 0; i<arr1.length;i++) {
			arr1[i] =arr1[i]*arr1[i];
			System.out.println("Square of arr1 : " + arr1[i]+"\t ");
		}
		
//		 Write a program to store cube of the elements in another arrays and Display all the three arrays.
		
			for(int i=0; i<arr1.length; i++) {
			
			arr1[i] =arr1[i]*arr1[i]*arr1[i];
			
			System.out.println("cube of arr1 : "+arr1[i]+"\t ");
		}
	}

}
