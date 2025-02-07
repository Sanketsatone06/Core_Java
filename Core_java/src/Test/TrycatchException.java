package Test;

import java.util.Scanner;

public class TrycatchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter num1 : ");
			int num1 = sc.nextInt();
			
			System.out.println("enter num2 : ");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("Result : "+result);
		}catch(ArithmeticException e) {
			System.out.println("error : division by zero is not allowed .");
		}catch(Exception e) {
			System.out.println("error : Invalid input. Please enter valid numbers.");
		}

	}

}
