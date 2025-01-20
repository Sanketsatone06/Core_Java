package com.org;

import java.util.Scanner;

public class EncapExam {
	
	private String name;
	
	public void setName(String name1) 
	{
		
		this.name=name1;
	}
	
	public String getName() {
		
		return name;
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		
		String name1=sc.nextLine();
		
		EncapExam obj = new EncapExam ();
		obj.setName(name1);

		String name2=obj.getName();
		System.out.println(name2);
		
	}

}
