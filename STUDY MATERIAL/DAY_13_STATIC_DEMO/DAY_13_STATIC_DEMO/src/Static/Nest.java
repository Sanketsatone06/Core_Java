package Static;

public class Nest {
	
	static int num=10;
	
	
	 class Second{
		
		 void method1() {
			System.out.println("static class non static method :" +num);
		}
		
	}

	public static void main(String[] args) {
		Nest n= new Nest();
		
		Nest.Second n2 = n.new  Second();
		
		n2.method1();

	}

}
