package ovverridingMethod;

public class Programme1 {

	class A{
		
		void method1() {
				
			System.out.println("Hello 1");
		}
	}
	
	class B  extends A{
		
		void method1() {
				
			System.out.println("Hello 2");
			super.method1();
		}
	}
	
	public static void main(String[] args) {
		
		Programme1  obj = new Programme1 ();
		
//		Programme1 .A obja= obj.new A();
//		obja.method1();
		
		Programme1.B objb=obj.new B();
		objb.method1();
	}
}
