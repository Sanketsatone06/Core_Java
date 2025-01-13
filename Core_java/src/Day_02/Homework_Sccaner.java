package Day_02;

import java.util.Scanner;

public class Homework_Sccaner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the student's name:");
		
		String name = sc.nextLine(); System.out.println("Enter marks for subject 1:");
		int marks1 = sc.nextInt(); System.out.println("Enter marks for subject 2:");
		int marks2 = sc.nextInt(); System.out.println("Enter marks for subject 3:");
		
		int marks3 = sc.nextInt(); double average = (marks1 + marks2 + marks3) / 3.0;
		
		System.out.println("The average marks for " + name + " is: " + average); 
		} 
	}
