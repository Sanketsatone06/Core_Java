package com.org;

public class Sum_even_no {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		
		while(i<=50) {
			
			if(i%2==0) {
				sum=sum+i;
				
			}
			i++;
			
		}
		System.out.println(sum);
	
	}

}