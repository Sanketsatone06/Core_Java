package Day_12;

class one{
	public void method1() {
		System.out.println("class one");
	}
}

class two extends one{
	public void method2() {
		System.out.println("class two");
	}
}

class three extends one{
	public void method3() {
		System.out.println("class three");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		two obj1 =  new two();
		obj1.method1();
		obj1.method2();
		
		three obj2 = new three();
		obj2.method1();
		obj2.method3();
		
		
	}

}
