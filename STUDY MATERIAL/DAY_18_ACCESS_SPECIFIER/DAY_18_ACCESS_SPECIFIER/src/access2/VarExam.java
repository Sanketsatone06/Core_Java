package access2;


class A{
	
	public int var1=10;
	protected int var2=20;
	int var3=30;
	
	
}

class B extends A{
	
}


public class VarExam {

	
	private int var4=40;
	public static void main(String[] args) {
		
		B bobj= new B();
		
		System.out.println(bobj.var1);
		System.out.println(bobj.var2);
		System.out.println(bobj.var3);
		
		
		VarExam ve= new VarExam();
		System.out.println(ve.var4);
		

	}

}
