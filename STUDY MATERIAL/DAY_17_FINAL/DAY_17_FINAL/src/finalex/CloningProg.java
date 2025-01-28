package finalex;

public class CloningProg {
	
	int num1=10;
	int num2=20;

	public static void main(String[] args) {
		
		
		 CloningProg d1=new  CloningProg();
        System.out.println(d1.num1);
        System.out.println(d1.num2);
        System.out.println("shallow copy");
      
        
//        SHALLOW COPY CODE
        
        CloningProg d2=d1;
        
        System.out.println(d2.num1);
        System.out.println(d2.num2);
        
//        DEEP COPY CODE
        
        CloningProg d3= new CloningProg();
        d3.num1=d1.num1;
        d3.num2=d1.num2;
        
        
        
        System.out.println("Deep copy");
        
        System.out.println(d3.num1);
        System.out.println(d3.num2);
        
	}

}
