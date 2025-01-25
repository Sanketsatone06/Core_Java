package Day_15;

import java.util.Scanner;

public class Average {

    void calculateAndPrintAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        System.out.println("The average of the three numbers is: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        Average obj = new Average();
        obj.calculateAndPrintAverage(num1, num2, num3);

    }
}
