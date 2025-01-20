package com.org;

public class ReturnVoidExample {

	
	    public static void findNumber(int[] numbers, int target) {
	        for (int num : numbers) {
	            if (num == target) {
	                System.out.println("Found " + target);
	                return; 
	            }
	        }
	        System.out.println("Number not found.");
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        findNumber(numbers, 30); 
//	        findNumber(numbers, 60); 
	    }


}
