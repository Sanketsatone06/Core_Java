package Day_06;

public class Classwork_p1 {

	public static void main(String[] args) {
		
		int [] arr1 = {10,30,50,60};
		
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("Index: [" + i + "]"+" Element: [" + arr1[i]+"]");
			sum += arr1[i];
		}
		
		System.out.println("addition of aaray of element is "+ sum);
		System.out.println();
	}
	
}
