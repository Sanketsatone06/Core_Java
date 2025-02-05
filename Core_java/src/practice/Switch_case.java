package practice;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 : ");
		int num2 =  sc.nextInt();
		
		
		System.out.println("Enter number between  1 to 5 : ");
		int result = sc.nextInt();
		
		switch (result) {
		case 1:
		System.out.println("Addition : " +(num1 + num2));
		break;
		
		case 2:
		System.out.println("Substarction :" +(num1 - num2));
		break;
		
		case 3:
		System.out.println("multiplication :" + (num1 * num2));
		break;
			
		case 4:
		System.out.println("modulas : "+(num1%num2));
		break;
		
		case 5 :
		if(num2 !=0) {
		System.out.println("divide : " + (num1/num2));
		}
		else {
		System.out.println("num 2 is not be zero ");
		}
		break ;
		
		default:
			System.out.println("Enter number 1 to 5");
		}
	}

}
