package com.org;

public class Palindrone_pro {

	public static void main(String[] args) {
		int num=121;
		
		int onum=num;
		
		int newnum=0;
		
		
		while(num!=0)
		{
			
			int ones=num%10;
			newnum = newnum*10+ones;
			num=num/10;
			
		}
		
		if(onum==newnum) {
			
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println(" not Palindrome");
		}
		

	}

}
