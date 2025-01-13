package Day_02;

import java.util.Scanner;

public class Homework_p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee's name:");
		String name = sc.nextLine(); System.out.println("Enter the basic salary:");
		double basicSalary = sc.nextDouble();
		double bonus = basicSalary * 0.40;
		double grossSalary = basicSalary + bonus;
		System.out.println("The gross salary for " + name + " is: " + grossSalary);
		}
	}
