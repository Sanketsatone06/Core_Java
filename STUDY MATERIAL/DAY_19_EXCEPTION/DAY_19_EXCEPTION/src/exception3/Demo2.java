package exception3;

public class Demo2 {

	public static void main(String[] args) {
		int age=14;
		try {
			
			if(age<18) {
				
				throw new ArithmeticException("you are not eligible");
			}
			else {
				System.out.println("you are eligible for vote");
			}
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
