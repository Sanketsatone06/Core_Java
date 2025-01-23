package Day_14;

public class Homework {
	static String one = "sanket";
	static String two = "      satone";
	static String three = "MUMBAI";

	public static void main(String[] args) {
		System.out.println("Replace function : "+one.replace("t","y"));
		System.out.println("Trim function : " + two.trim() );
		String reversed = new StringBuilder(one).reverse().toString();
		System.out.println("reverse function : " + reversed);
		System.out.println("uppercase function : " + three.toLowerCase());
		String reverse = new StringBuilder(three).reverse().toString();
		System.out.println("reverse function : " + reverse);
	}

}
