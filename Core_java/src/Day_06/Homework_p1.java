package Day_06;

import java.util.Scanner;

public class Homework_p1 {

	public static void main(String[] args) {
		int arr6[] = {10,20,30,40,50};
		int key2= 40;
		
		for(int i=0;i<arr6.length; i++ ) {
			if(arr6[i] == key2) {
				System.out.println("position of "+ key2+ " is "+ (i+1));
			}
		}
		System.out.println();
	}
}


