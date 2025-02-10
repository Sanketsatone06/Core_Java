package practice;

	 abstract class vehicle {
		abstract void method();
	}
	
	 class Car extends vehicle{

		@Override
		void method() {
			System.out.println(4);
		}
		
	}
	
	 class Cycle extends vehicle{

		@Override
		void method() {
			System.out.println(2);
			
		}
		
	}
	public class Abstraction {
	public static void main(String[] args) {
		
		vehicle obj = new Car();
		obj.method();
		
		vehicle obja = new Cycle();
		obja.method();

	}

}
