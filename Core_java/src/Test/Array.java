package Test;

public class Array {

	public static void main(String[] args) {
		
		int [] number = new int [5];
		
		number [0] =10;
		number [1] =20;
		number [2] =30;
		number [3] =40;
		number [4] =50;
		
		System.out.println("number in the array  : " );
		for(int i =0;i<number.length;i++) {
			System.out.println(number[i] + " ");
		}
		System.out.println();
	}

}
