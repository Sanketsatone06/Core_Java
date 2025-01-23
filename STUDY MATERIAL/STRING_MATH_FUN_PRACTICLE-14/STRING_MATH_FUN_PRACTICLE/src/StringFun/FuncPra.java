package StringFun;

public class FuncPra {

	public static void main(String[] args) {
		
		String s1= "Hello";
		
		String s2 ="Welcome";
		
		
		String s3="    space before";
		
		String s4="java is a plateform independent language";
		
		String s5 ="Heello";
		
		String s6="HELLO";
		
		String fruits = "Apple,Banana,Cherry";
		
		
		System.out.println(" length function : "+s1.length());
		

		System.out.println(" uppercase function : "+s1.toUpperCase());
		System.out.println(" lowercase function : "+s1.toLowerCase());
		
		System.out.println(" charaAt function : "+s1.charAt(3));
		
		System.out.println(" substring function : "+s2.substring(2,4));
		
		System.out.println(" without function : "+s3);
		
		System.out.println(" substring function : "+s3.trim());
		System.out.println(" concat function : "+s1.concat(" ").concat (s2));
		
		System.out.println("Replace function :" +s1.replace("e", "a"));
		
		System.out.println("Contain function :" +s1.contains(s5));
		
		System.out.println("equal function :" +s1.equals(s6));
		System.out.println("equal ignore Case function :" +s1.equalsIgnoreCase(s6));
		
		System.out.println("find first index of "+s4.indexOf("plateform"));
		
		System.out.println("find last index of "+s4.lastIndexOf("plateform"));
		
		 String[] f = fruits.split(",");
		 System.out.println(f[0]); 
	       
	        
	        System.out.println("Start With function "+s5.startsWith("j"));
	        
	        System.out.println("End With function "+s5.endsWith("e"));
	        
	        char[] d=s1.toCharArray();
	        
	        System.out.println("to char array " + d[0]);
		
	        
	       
		
		
		
	

	}

}
