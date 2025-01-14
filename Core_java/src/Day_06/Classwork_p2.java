package Day_06;

public class Classwork_p2 {

	public static void main(String[] args) {
		
		int arr2[] = {10,20,30,40,50,55};
		int arr3[] = {10,20,30,40,50,55};
		int sum[]= new int[arr2.length];
		
		
		for(int i=0; i<6; i++) {
			sum[i]= arr2[i] + arr3[i];
			System.out.print(sum[i]+ "\t ");
		}
		System.out.println();
		System.out.println();

	}

}
