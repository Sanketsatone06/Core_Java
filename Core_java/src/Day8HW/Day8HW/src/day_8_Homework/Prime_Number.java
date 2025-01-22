package day_8_Homework;

import java.util.Scanner;

public class Prime_Number {
	
	public static void primeno(int num) {
		for ( int i=1; i<num; i++) {
			if ( num % i == 0 ) {
				System.out.println(num +"Prime Number");
			} else {
				System.out.println(num +" Not a prime number");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		primeno(num);

	}

}
