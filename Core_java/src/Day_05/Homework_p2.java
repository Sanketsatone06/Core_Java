package Day_05;

public class Homework_p2 {

	public static void main(String[] args) {
		
		int sumEven = 0;
		int sumOdd = 0;
		int i =1;
		
		while(i<=30) {
			if(i%2==0) {
				sumEven +=1;
			}else {
				sumOdd +=1;
			}
			i++;
		}
		
		System.out.println("sum of Even 1 to 30 is : " + sumEven);
		
		System.out.println("sum of Odd 1 to 30 is : " + sumOdd);
	}

}
