package Day_03;

import java.util.Scanner;

public class Homework_p4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 3-digit number: ");
		int number = scanner.nextInt();
		if (number >= 100 && number <= 999) {
			
			int sum_of_digits = 0;
			int temp = number;
			while (temp > 0) {
				sum_of_digits += temp % 10; temp /= 10; 
				}
			System.out.println("The sum of the digits of " + number + " is " + sum_of_digits + "."); 
			} else
			{ System.out.println("Please enter a 3-digit number.");
			} 
		}
	}

