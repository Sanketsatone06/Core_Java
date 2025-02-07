package Test;

public class Method_Overloading {
	
	static void multiply(int a , int b) {
		System.out.println("taking a two intigers multiplication : "+a*b);
	}
	
	static void multiply(int a,int b,int c) {
		System.out.println("take a three intiger multiplication : "+a*b*c);
	}

	public static void main(String[] args) {
		
		multiply(10,20);
		multiply(10,20,30);
		
		

	}

}
