package Test;

import java.util.Scanner;

//1. Scanner (User Input) and if else
//Write a Java program to take an integer input from the user and print whether it's even or odd.

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		
		int num = sc.nextInt();
		
		
		if(num%2==0) {
			System.out.println(num+" is even number");
		}else if(num%2!=0) {
			System.out.println(num+" is odd number");
		}
		else {
			System.out.println("enter a valid number");
		}

	}

}


