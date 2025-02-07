package practice;

public class Nest {
	
	static int num = 10;
	
	 class Second{
		void method1() {
			System.out.println("non static method");
		}
	}

	public static void main(String[] args) {
		
		Nest n = new Nest();  	 
		Nest.Second n2 = n.new Second();
		n2.method1();
	}

}
