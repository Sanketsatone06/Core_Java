package Day_13;

import java.util.Scanner;



	class Rectangle{
		public static float calcuperi(float length ,float bredth) {
			return 2* (length + bredth);
		}
	}
	
	public class perimeter{
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the length of Rectangle : ");
			float length = sc.nextFloat();
			

			System.out.println("Enter the bredth of Rectangle : ");
			float bredth = sc.nextFloat();
			
			float perimeter = Rectangle.calcuperi(length , bredth);
			
			System.out.println("The perimeter of Rectangle is : " + perimeter);
	}
}

