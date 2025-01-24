package overloadingMethod;

public   class Programme1 {
	
		
	 void method1() {
		
		System.out.println("this is first method");
	}
	
       void method1(int a, int b) {
		
		System.out.println("sum of no is :" +(a+b));
	}

       void method1(int a, int b,int c) {
	
	System.out.println("sum of no is :" +(a+b+c));
      }
       void method1(String name,int age) {
    		
    		System.out.println(name +"    diiferent "+age);
    	      }
       

	public static void main(String[] args) {
		
		Programme1 obj = new Programme1();
		obj.method1();
		obj.method1(10,20);
		obj.method1(10,20,40);
		obj.method1("priyanka", 28);
		
	}

}
