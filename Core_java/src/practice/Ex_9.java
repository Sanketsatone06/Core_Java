package practice;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number =sc.nextInt();
		int reversed=0;
		
		while(number!=0) {
			int digit = number%10;
			reversed = reversed*10+digit;
			number = number/10;
		}
		
		System.out.println("Reversed number : " + reversed);

	}

}
