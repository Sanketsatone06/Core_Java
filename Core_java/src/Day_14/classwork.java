package Day_14;

public class classwork {
	
	static String one = "sanket";
	static String two = "Satone";
	
	public static void main(String[] args) {
		System.out.println("length function : " +one.length() );
		System.out.println("Concate function : " +one.concat(" ") .concat(two));
		System.out.println("uppercase function : " +one.toUpperCase() );
		System.out.println("Square root function : " + Math.sqrt(25) );
		System.out.println("cube root function : " + Math.cbrt(25) );
		System.out.println("find the angle 45 sin 45 : " +Math.sin(Math.toRadians(45)));
		System.out.println(" find the max no 10 and 20 : " + Math.max(10, 20) + " is max number");
		System.out.println(" find the round of 35.67 : " + Math.round(35.67));
		System.out.println(" find the min no 10 and 20 : " + Math.min(10, 20) + " is min number");
		System.out.println("equal function :" +one.equals(two));
		System.out.println("equalsIgnoreCase function :" +two.equalsIgnoreCase(one));
	}

}
