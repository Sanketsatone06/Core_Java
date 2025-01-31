package Day_18;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double T = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double R = scanner.nextDouble();

        double SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);

        scanner.close();
    }
}
