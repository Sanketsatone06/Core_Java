package Day_10;
import java.util.Scanner;

public class StudentInfo {
    
    // Class to hold student details
    static class Student {
        String name;
        int age;
        double subject1Marks;
        double subject2Marks;
        double subject3Marks;
        
        // Constructor to initialize the student details
        public Student(String name, int age, double subject1Marks, double subject2Marks, double subject3Marks) {
            this.name = name;
            this.age = age;
            this.subject1Marks = subject1Marks;
            this.subject2Marks = subject2Marks;
            this.subject3Marks = subject3Marks;
        }
        
        // Method to calculate average marks
        public double calculateAverage() {
            return (subject1Marks + subject2Marks + subject3Marks) / 3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking personal details and marks
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 1: ");
        double subject1Marks = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 2: ");
        double subject2Marks = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 3: ");
        double subject3Marks = scanner.nextDouble();
        
        // Creating a student object
        Student student = new Student(name, age, subject1Marks, subject2Marks, subject3Marks);
        
        // Displaying personal info
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        
        // Calculating and displaying average marks
        double averageMarks = student.calculateAverage();
        System.out.println("Average Marks: " + averageMarks);

        // Close scanner
        scanner.close();
    }
}
