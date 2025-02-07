package Test;


abstract class animal1 {
	
	abstract void makesound() ;
	
}
class Dog extends animal1{

	@Override
	void makesound() {
		System.out.println("dog extends animal");
		
	}
	
}

public class Animal {
	

	public static void main(String[] args) {
		
		Dog obj = new Dog();
		obj.makesound();
	}

}
