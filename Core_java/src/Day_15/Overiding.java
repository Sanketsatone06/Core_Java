package Day_15;

public class Overiding {
	
	
	class india {
		void method1() {
			System.out.println("hello world");
		}
	}
	
	class america extends india{
		void method1() {
			System.out.println("HEllo America");
			super.method1();
		}
	}
	
	class london extends america{
		void method1() {
			System.out.println("Hello london");
			super.method1();
		}
	}
	
	class china extends london{
		void method1() {
			System.out.println("Hello london");
			super.method1();
		}
	}

	public static void main(String[] args) {
		
		Overiding obj = new Overiding();
		
		Overiding .china obj1=obj.new china();
		obj1.method1();

	}

}
