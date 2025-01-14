package Day_06;

public class Classwork_p3 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};
		int key = 40;
		
		for(int i=0;i<arr1.length; i++ ) {
			if(arr1[i] == key) {
				System.out.println("position of "+ key + " is "+ (i+1));
			}
		}

	}

}
