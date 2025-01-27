package abstractex;


abstract class Bank2{
	
	abstract void Getint2();
	abstract void Getint3();
}

class Sbi2 extends Bank2{

	@Override
	void Getint2() {
		System.out.println("sbi method 1");
		
	}

	@Override
	void Getint3() {
		System.out.println("sbi method 2");
		
	}
	
	
}
class Hdfc2 extends Bank2{

	@Override
	void Getint2() {
		System.out.println("hdfc method 1");
		
	}

	@Override
	void Getint3() {
		System.out.println("hdfc method 2");
		
	}
	
}

class Icici2 extends Bank2{

	@Override
	void Getint2() {
		System.out.println("Icici method 1");
	}

	@Override
	void Getint3() {
		System.out.println("Icici  method 2");
		
	}
	
	
}

public class Combineabs {

	public static void main(String[] args) {
		
		 Sbi2 sb = new  Sbi2();
		 sb.Getint2();
		 sb.Getint3();
		 
		 Hdfc2 hb = new Hdfc2();
		 hb.Getint2();
		 hb.Getint3();
		
		 Icici2 ic = new Icici2();
		 ic.Getint2();
		 ic.Getint3();
		 
		 
		 

	}

}
