package practice;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) throws Exception {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		
		 age = sc.nextInt();
		 
		 if(age<18) {
			 throw new Exception("Not eligible");
		 }
		 else {
			 System.out.println("eligible for vote");
		 }

	}

}
