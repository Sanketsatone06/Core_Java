package com.org;

public class And_oprator {

	public static void main(String[] args) {
		int a =10;
		int b=15;
		int c=5;
		int d=35;
		
		if(a>b&& a>c && a>d) {
			
			System.out.println("A is greater no");
		}
		
		else if(b>a &&b>c&& b>d) {
			System.out.println("B is greater no");
		}
		
		else if(c>a && c>b && c>d) {
			
			System.out.println("C is greater no");
		}
		
		else  
		 {
			System.out.println("D is greater no");
		}
		
		
		

	}

}
