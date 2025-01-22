package com.org;

import java.util.Scanner;

public class Average_Marks_Function {
	
	 public static float Avg(float Html, float Css, float Bootstrap) {
	        return (Html + Css + Bootstrap) / 3;
	    }
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Html Marks : ");
		float Html = sc.nextFloat();
		
		System.out.println("Enter Css : ");
		float Css = sc.nextFloat();
		
		System.out.println("Enter Bootstrap : ");
		float Bootstrap = sc.nextFloat();
		
		float Average = Avg(Html, Css, Bootstrap );
		
		System.out.println("Your Average Marks is = " +Average);

	}

}
