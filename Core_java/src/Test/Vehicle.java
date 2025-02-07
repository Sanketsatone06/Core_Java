package Test;

interface Vehicle1 {
	
 void startEngine();

}

class car implements Vehicle1{

	@Override
	public void startEngine() {
		System.out.println("car class");
		
	}	
}

class bike implements Vehicle1{

	@Override
	public void startEngine() {
		System.out.println("bike class");
		
	}
	
}

class Vehicle{
	
	public static void main(String[]args) {
		
		car obj = new car();
		obj.startEngine();
		
		bike bobj = new bike();
		bobj.startEngine();
		
	}
	
}
