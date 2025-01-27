package Day_16;

import java.util.Scanner;

abstract class Table1 {

	 abstract void multiplication(int num);
	
}
  
   class multi extends Table1{
	   void multiplication(int num) {
		   System.out.println("Table is : "+ num + ":" );
		   for(int i =1 ; i<=10;i++) {
			   System.out.println(num+(num*i));
		   }
	   }
   }
   
   public class Table{
	   public static void main(String[]args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter a number of table : " );
		   int number = sc.nextInt();
		   
		   Table1 obj = new multi();
		   obj.multiplication(number);
		   
	   }
   }
