package abstractex;

public class Main {

	public static void main(String[] args) {
		
		Sbi sbobj = new Sbi();
		sbobj.getInterest();
		
		Hdfc hobj= new Hdfc();
		hobj.getInterest();
		
		Icici iobj= new Icici();
		iobj.getInterest();
	}

}
