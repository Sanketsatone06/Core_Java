package Day_18;

import java.util.Scanner;

public class Covert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter centimeter");
		double cm = sc.nextDouble();
		
		double meter = cm/100;
		double kilometer = cm/100000;
		
		System.out.println("Meter is " +meter);
		System.out.println("Kilometer is " +kilometer);

	}

}
