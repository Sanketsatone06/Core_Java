package Day_05;

public class Homework_p14 {
public static void main(String[]args) {
	System.out.println("Prime numbers between 101 and 150:");

    // Loop through numbers from 101 to 150
    for (int num = 101; num <= 150; num++) {
        boolean isPrime = true;

        // Check if the number is divisible by any number from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // If num is prime, print it
        if (isPrime) {
            System.out.print(num + " ");
        }
    }
}
}
