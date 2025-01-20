package com.org;

public class ConstrOverloEx {
	
	ConstrOverloEx (String name ){
		
		System.out.println(name);
		
	}
	
     ConstrOverloEx (int age){
    	 
    	 System.out.println(age);
	}

	public static void main(String[] args) {
	 new ConstrOverloEx("Priyanka");
	 new ConstrOverloEx(28);

	}

}
