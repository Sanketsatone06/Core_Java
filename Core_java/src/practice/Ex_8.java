package practice;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		
		int n= sc.nextInt();
		
//		for(int i = 1; i<=6;i++) {
//			System.out.println( "***********");
		
		for(int i = n ; i>=1; i--) {
			System.out.print(i + " " + "//" );
		}
	}
}