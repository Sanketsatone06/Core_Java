package Day_18;

import java.util.Scanner;

public class Wovel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet : ");
		
		char ap = sc.next().charAt(0);
		
		if(ap =='a'||ap =='e'|| ap == 'i' || ap == 'o' || ap == 'u') {
			System.out.println( ap +" "+"This  alphabet is wovel ");
		}
		else {
			System.out.println( ap +" "+"This  alphabet is not  wovel ");
		}
	}

}
