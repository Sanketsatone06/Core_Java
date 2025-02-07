package com.org;

 class One{
	 public static void method1() {
		 System.out.println("this parent class");
	 }
}
 
 class two extends One{
	 public static void method2() {
		 System.out.println("thi is second class");
	 }
 }

public class Single {

	public static void main(String[] args) {
		
		two obj = new two();
		obj.method1();
		obj.method2();
	}

}
