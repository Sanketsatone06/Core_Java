package practice;

public class Parameterized_constructor {
	
	Parameterized_constructor(int a , int b){
		System.out.println("sum of no is  :" + (a+b));
	}

	public static void main(String[] args) {
		
		new Parameterized_constructor(30,40); 
	}

}
