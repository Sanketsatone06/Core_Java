package Day_05;

import java.util.Scanner;

public class Homework_p16 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Accept base from the user
	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();

	        // Accept index (exponent) from the user
	        System.out.print("Enter the index (exponent): ");
	        int index = scanner.nextInt();

	        // Calculate power using a loop
	        int result = 1;
	        for (int i = 1; i <= index; i++) {
	            result *= base;  // Multiply result by base, index times
	        }

	        // Print the result
	        System.out.println(base + "^" + index + " = " + result);

	}

}
