package Test;

	 class shape{
		 void area() {
			 System.out.println("this is shape class");
		 }
	 }
		 
		 class rectangel extends shape{
			 void area() {
				 System.out.println("this  is rectangle class");
			 }
		 }
		 
		 class circle extends shape{
			 void area() {
				 System.out.println("this  is circle class");
			 }
		 }
	 
	 
	 public class Polymorphism {

	public static void main(String[] args) {
		
		shape obja = new shape();
		obja.area();
		
		shape objb = new rectangel();
		objb.area();
		
		shape objc =new circle();
		objc.area();
		
	}

}
