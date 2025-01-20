package com.org;

public class CopyconstructerExample {
	CopyconstructerExample(int a, int b){
		
		System.out.println(a-b);
		
	}
	
	public static void main(String[] args) {
		
		CopyconstructerExample c1 = new CopyconstructerExample(20,10);
		CopyconstructerExample c2 = new CopyconstructerExample(40,10);
		
	}

}
