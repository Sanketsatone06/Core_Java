package com.org;

public class Reverse_digit_sum {

	public static void main(String[] args) {
		int a=234;
		int sum =0;
		
		while(a!=0) {
			
			int r=a%10;
			
			a=a/10;
			sum=sum+r;
			
			
		}
		
		System.out.println(sum);

	}

}
