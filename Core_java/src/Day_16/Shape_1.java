package Day_16;

 abstract class jk {

	abstract void method(float radius);
	abstract void method(int base , int height);
	
}

 class hello extends jk{

	@Override
	void method(float radius) {
		
		System.out.println(3.14*radius*radius);
		
	}

	@Override
	void method(int base, int height) {
		System.out.println(0.5*base*height);
		
	}
	
}

public class Shape_1{
	
	public static void main(String[]args) {
		
		hello obj = new hello();
		obj.method(14);
		obj.method(10, 24);		
	}
	
}
