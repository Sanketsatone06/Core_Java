package Day_05;

import java.util.Scanner;

public class Homework_p5 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Accept a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int sum = 0;
	        int originalNumber = number; // To keep the original number for output

	        // Calculate the sum of digits
	        while (number > 0) {
	            int digit = number % 10; // Get the last digit
	            sum += digit; // Add the last digit to the sum
	            number /= 10; // Remove the last digit from the number
	        }
	        
	        // Print the result
	        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);
	 

	}

}
