package practice;

public class constructor_overloading {
	
	constructor_overloading(String name){
		System.out.println("my name is : " +name);
	}
	
	constructor_overloading(int age){
		System.out.println("age is : " +age);
	}

	public static void main(String[] args) {
	
		constructor_overloading obj1 = new constructor_overloading("sanket");
		constructor_overloading obj2 =  new constructor_overloading(25);
		
	}

}
