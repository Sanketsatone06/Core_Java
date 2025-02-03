package exception3;

public class Demo {

	public static void main(String[] args) {
	
		int num1=20;
		
		int num2=0;
	
		try {
			int res=num1/num2;
			
			
			System.out.println(res);
		}
	catch(Exception e)
		{
		
		System.out.println("zero not posiible");
		}
		
		System.out.println("Hello this second block");
	
	}

}
