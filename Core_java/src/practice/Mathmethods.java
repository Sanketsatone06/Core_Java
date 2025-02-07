package practice;

public class Mathmethods {

	public static void main(String[] args) {
		
		double a = -25.5;
        double b = 3.0;
        double c = 16.0;
        double angle = 45.0;
        
        System.out.println("Absolute function : " + Math.abs(a));
        System.out.println("max function : " + Math.max(a, b));
        System.out.println("min function : " + Math.min(a, b));
        System.out.println("sqrt function : " + Math.sqrt(c));
        System.out.println("cbrt function : " + Math.cbrt(c));
        System.out.println("round function : " + Math.round(5.4));
        System.out.println("ceil function : " + Math.ceil(5.2));
        System.out.println("floorfunction : " + Math.floor(5.9));
        System.out.println("random function : " + Math.random());
        System.out.println("log function : " + Math.log(50));
        System.out.println("log10 function : " + Math.log10(10000));
        System.out.println("sin function : " + Math.sin(Math.toRadians(angle)));
        System.out.println("Hypotenius function : " + Math.hypot(5,6));
	}

}
