package finalex;

class A{
	
	 void method1() {
		
		System.out.println("method of A");
	}
}

class B extends A{
void method1() {
		
		System.out.println("method of b");
		super.method1();
	}
	
}


public class FinalVarEx {

	public static void main(String[] args) {
	B bobj= new B();
	bobj.method1();

	}

}
