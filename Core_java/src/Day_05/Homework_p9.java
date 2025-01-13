package Day_05;

public class Homework_p9 {
public static void main(String[]args) {
	int sum = 0;  // Initialize sum to 0
    int i = 1;    // Start from 1

    // Use while loop to sum numbers from 1 to 10
    while (i <= 10) {
        sum += i;  // Add the current number to sum
        i++;       // Increment the counter
    }

    // Print the result
    System.out.println("The sum of numbers from 1 to 10 is: " + sum);
}
}
