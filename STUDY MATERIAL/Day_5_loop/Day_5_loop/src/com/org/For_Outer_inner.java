package com.org;

public class For_Outer_inner {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=4; i++) {
			
			
			for(int j=5; j<=10; j++) {
				
				System.out.print(i*j + " \t ");
			}
			
			System.out.println();
		}

	}

}
