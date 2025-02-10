package practice;

public class Method_overloading {
	
	void method1() {
		System.out.println("this is method overloading example");
	}
	
	void method1(int a,int b) {
		System.out.println((a+b));
	}
	
	void method1(int a,int b,int c) {
		System.out.println((a+b+c));
	}
	
	void method1(String name,int age) {
		System.out.println(name + age);
	}
	

	public static void main(String[] args) {
		
		Method_overloading obj = new Method_overloading();
		
		obj.method1(10,15);
		obj.method1(10,15,5);
		obj.method1("sanket",25);

	}

}
