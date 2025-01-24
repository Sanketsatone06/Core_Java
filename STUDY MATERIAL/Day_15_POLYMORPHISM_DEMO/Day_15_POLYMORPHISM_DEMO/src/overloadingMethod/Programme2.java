package overloadingMethod;

public class Programme2 {
	
	Programme2(String name)
	{
		
		System.out.println(name);
	}
	
	
	Programme2(int a, int b)
	{
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		new Programme2("priyanka");
		
		new Programme2(2,3);
		

	}

}
