package practice;

public class Method_overriding {
	
	class A {
		void method1() {
			System.out.println("hello1");
		}
	}
	
	class B extends A {
		void method1() {
			System.out.println("Hello2");
			super.method1();
		}
	}

	public static void main(String[] args) {
		
		Method_overriding obj = new Method_overriding();
		
		Method_overriding.A obja = obj.new A();
		obja.method1();
		
		Method_overriding.B objb =  obj.new B();
		objb.method1();
	}

}
