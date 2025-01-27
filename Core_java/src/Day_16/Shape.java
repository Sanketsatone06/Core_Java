package Day_16;

abstract class Shape1 {
	
	abstract void print_area(int side);
	
	abstract void print_area(int length , int bredth) ;
}
	class calculate extends Shape1{
		
		void print_area(int side) {
			int area = side * side;
			System.out.println("Area of Sqare is : " + area);
		}
		
		
		void print_area(int length,int bredth) {
			int area = length * bredth;
			System.out.println("Area of rectangle is : " + area);
		}	
		}
		
		
	
	

public class Shape{
public static void main(String[]args) {
		
		calculate obj = new calculate();
		
		obj.print_area(5);
		obj.print_area(12,15);
}
}
