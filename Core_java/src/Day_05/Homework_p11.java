package Day_05;

import java.util.Scanner;

public class Homework_p11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Factors of " + number + " are: ");

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");  // Print the factor
            }
        }

	}

}
