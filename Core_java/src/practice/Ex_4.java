package practice;

public class Ex_4 {

	public static void main(String[] args) {
		
		int n = 1;
		int sum =0;
		
		while(n<=10) {
			if(n%2==0) {
				sum +=n;
			}
			n++;
		}
		System.out.println("sum of even 1 to 10 is : " + sum );
	}

}
