package com.org;

public class ParameterConstructerExam {
	
	ParameterConstructerExam( int a, int b){
		System.out.println("sum of no is " + (a+b));
		
		
	}
	public static void main(String[] args) {
		
		new ParameterConstructerExam( 20, 30);
		
		ParameterConstructerExam obj = new ParameterConstructerExam(10,20);

	}

}
