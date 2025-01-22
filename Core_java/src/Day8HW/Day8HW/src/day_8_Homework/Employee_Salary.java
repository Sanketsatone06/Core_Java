package day_8_Homework;

import java.util.Scanner;

public class Employee_Salary {
	
	public static double empsalary(double bsal, String name) {
		if ( bsal > 50000 ) {
			return bsal * 55 / 100 + bsal;
		} else if ( bsal > 40000 ) {
			return bsal * 45 / 100 + bsal;
		} else if ( bsal > 20000 ) {
			return bsal * 35 / 100 + bsal;
		} else {
			return bsal * 25 / 100 + bsal;
		}
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee Basic Salary : ");
		double bsal = sc.nextDouble();
		
		double gsal = empsalary(bsal, name);
		System.out.println(name + "'s Gross Salary = " +gsal);

	}

}
