package interfaceEx;

public class Subclass implements Interface1,Interface2 {

	@Override
	public void method3() {
		System.out.println("method 3 interface 2");
		
	}

	@Override
	public void method4() {
	System.out.println("method 4 interface 2");
		
	}

	@Override
	public void method1() {
		System.out.println("method 1 interface 1");
		
	}

	@Override
	public void method2() {
		System.out.println("method 2 interface 1");
		
	}

}
