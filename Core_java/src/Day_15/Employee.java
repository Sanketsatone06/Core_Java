package Day_15;

import java.util.Scanner;

public class Employee {
	double salary;
	int h;
	
	void getInfo( double salary, int h ) {
		this.salary=salary;
		this.h=h;
	}
	
	void addsal() {
		if( salary < 10000 ) {
			salary = salary * 1.5;
		
		}
	}	
	
	void addwork() {
		if( h > 8 ) {
			salary = salary * 1.2;
		}
	}
	void gross_salary() {
		System.out.println("Updated Salary : " + salary);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Hours of working per Day : ");
		int h = sc.nextInt();
		
		Employee emp = new Employee();
		
		emp.getInfo(salary,h);
		emp.addsal();
		emp.addwork();
		emp.gross_salary();
	}

}