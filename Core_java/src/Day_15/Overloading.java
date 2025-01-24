package Day_15;

public class Overloading {
	
	
	void overload(String name) {
		System.out.println("method overloading by our own example.");
	}
		
	void overload(int a ,int b) {
		System.out.println("Addition is :"+(a+b));
	}
	
	void overload(float a ,float b) {
		System.out.println("Addition in floating is :"+(a+b));
	}
	
	void overload(int a ,int b,int c) {
		System.out.println("Addition of three no is  :"+(a+b+c));
	}

	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		
		obj.overload(null);
		obj.overload(20, 30);
		obj.overload(20.5f, 30.5f);
		obj.overload(20, 30,80);

	}

}
