package Day_16;

abstract class Bank1 {
	
	abstract void getRateOfInterest();

}

class sbi extends Bank1{
	void getRateOfInterest() {
		System.out.println("SBI bank intrest is : 5 % ");
	}
}

class icici extends Bank1{
	void getRateOfInterest() {
		System.out.println("ICICI bank intrest is : 7%");
	}
}

class Hdfc extends Bank1{
	void getRateOfInterest() {
		System.out.println("HDFC bank intrest is : 9%");
	}
}

class Axis extends Bank1{
	void getRateOfInterest() {
		System.out.println("AXIS bank intrest is : 11%");
	}
}


 public class Bank{
	 
	 public static void main(String[]args) {
		 
			sbi obj = new sbi();
			obj.getRateOfInterest();
			
			icici obj1 =new icici();
			obj1.getRateOfInterest();
			
			Hdfc obj2 = new Hdfc();
			obj2.getRateOfInterest();
			
			Axis obj3 = new Axis();
			obj3.getRateOfInterest();
		}
 }
 
	 
 


