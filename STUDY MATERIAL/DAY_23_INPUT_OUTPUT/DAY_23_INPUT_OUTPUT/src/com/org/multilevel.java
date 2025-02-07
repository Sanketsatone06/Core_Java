package com.org;


class multi{
	public static void method1() {
		System.out.println("this is first class");
	}
}

class multi2 extends multi{
	public static void method2() {
		System.out.println("this is second class");
	}
}

class multi3 extends multi2{
	public static void method3() {
		System.out.println("this is second class");
	}
}

public class multilevel {

	public static void main(String[] args) {
		
		
		
		
		multi3 bobj = new multi3();
		bobj.method1();
		bobj.method3();bobj.method2();
		

	}

}
