package Day_05;

public class Homework_p10 {

	public static void main(String[] args) {
		int sumEven = 0;  // To store the sum of even numbers
        int sumOdd = 0;   // To store the sum of odd numbers

        // Loop through numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sumEven += i;  // Add the even number to sumEven
            } else {           // Else, the number is odd
                sumOdd += i;   // Add the odd number to sumOdd
            }
        }

        // Print the results
        System.out.println("Sum of even numbers between 1 and 30: " + sumEven);
        System.out.println("Sum of odd numbers between 1 and 30: " + sumOdd);

	}

}
