package MathFun;

public class FunPra {

    public static void main(String[] args) {

        double a = -25.5;
        double b = 3.0;
        double c = 16.0;
        double angle = 45.0;
        
        System.out.println("Absolute function: " + Math.abs(a));
        System.out.println("Max function: " + Math.max(10, 5));

       
        System.out.println("Min function: " + Math.min(a, b));

       
        System.out.println("Power function (b^2): " + Math.pow(b, 2));

       
        System.out.println("Square root function: " + Math.sqrt(c));

       
        System.out.println("Cube root function: " + Math.cbrt(27.0));

       
        System.out.println("Round function: " + Math.round(5.7));

      
        System.out.println("Ceil function: " + Math.ceil(5.2));

       
        System.out.println("Floor function: " + Math.floor(5.9));

      
        System.out.println("Random function: " + Math.random());

      
        System.out.println("Log function: " + Math.log(50));

      
        System.out.println("Log10 function: " + Math.log10(10000));

     
      

       
        System.out.println("Sine function: " + Math.sin(Math.toRadians(angle)));

      
        System.out.println("Cosine function: " + Math.cos(Math.toRadians(angle)));

     
        System.out.println("Tangent function: " + Math.tan(Math.toRadians(angle)));

       
        System.out.println("Arcsine function: " + Math.asin(0.5));

      
        System.out.println("Arctangent function: " + Math.atan(1));

     
        System.out.println("To Radians function: " + Math.toRadians(45));

     
        System.out.println("Hypotenuse function: " + Math.hypot(3, 4)); 
    }
}
