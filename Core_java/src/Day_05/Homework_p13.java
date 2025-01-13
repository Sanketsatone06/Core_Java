package Day_05;

import java.util.Scanner;

public class Homework_p13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Accept a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;

	        // Calculate the sum of digits
	        while (number > 0) {
	            int digit = number % 10;  // Get the last digit
	            sum += digit;             // Add the last digit to sum
	            number /= 10;             // Remove the last digit from the number
	        }

	        // Print the sum of digits
	        System.out.println("The sum of digits is: " + sum);

	}

}
