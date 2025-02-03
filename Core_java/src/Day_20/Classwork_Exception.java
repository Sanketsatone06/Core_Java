package Day_20;  

import java.util.Scanner;  

// Custom exception class
class MyException extends Exception {  
    public MyException(String message) {  
        super(message);  
    }  
}  

public class Classwork_Exception {  
    public static void main(String[] args) {  
        Scanner scnr = new Scanner(System.in);  

        // 1. Custom exception for student admission (Age check)
        System.out.print("Enter student age for admission: ");
        int age = scnr.nextInt();  

        try {  
            if (age < 3) {  
                throw new MyException("Age must be at least 3 years for admission.");  
            } else {  
                System.out.println("Admission Completed!");  
            }  
        } catch (MyException e) {  
            System.out.println("Exception: " + e.getMessage());  
        }  

        // 2. Custom exception for job application (Experience check)
        System.out.print("Enter years of experience: ");  
        int exp = scnr.nextInt();  

        try {  
            if (exp < 1) {  
                throw new MyException("You can't apply for the job if experience is less than a year.");  
            } else {  
                System.out.println("You can apply!");  
            }  
        } catch (MyException e) {  
            System.out.println("Exception: " + e.getMessage());  
        }  

        // 3. Custom exception for divide by zero  
        try {  
            System.out.print("Enter a number to divide 10 by: ");
            int divisor = scnr.nextInt();  
            if (divisor == 0) {  
                throw new MyException("Cannot divide by zero.");  
            }  
            int result = 10 / divisor;  
            System.out.println("Result: " + result);  
        } catch (MyException e) {  
            System.out.println("Exception: " + e.getMessage());  
        }  

        // 4. Demonstrating throws statement
        try {  
            checkEvenNumber(10);  
        } catch (MyException e) {  
            System.out.println("Exception: " + e.getMessage());  
        }  

        // Close scanner
        scnr.close();
    }  

    // Method demonstrating throws statement
    public static void checkEvenNumber(int num) throws MyException {  
        if (num % 2 == 0) {  
            throw new MyException("Number is even: Using throw and throws demonstration.");  
        }  
    }  
}
