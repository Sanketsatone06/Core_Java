package practice;

public class String_methods {
	
	static String one = "sanket";
	static String two = "SATONE";
	static String three = "        pune is IT sector";
	static String four = "sanket";
	static String five ="SANKET";
	static String six ="I am clever student";
	static String seven = "";

	public static void main(String[] args) {
		
		System.out.println("Length function : "+one.length());
		System.out.println("CharAt function : "+two.charAt(2));
		System.out.println("Substring function : "+one.substring(2, 4));
		System.out.println("toLowerCase  function : "+two.toLowerCase());
		System.out.println("toUpperCase function : "+one.toUpperCase());
		System.out.println("trim function : "+three.trim());
		System.out.println("equal function : "+(one.equals(four)));
		System.out.println("equalsIgnoreCase function : "+one.equalsIgnoreCase(five));
		System.out.println("replace function : "+(three.replace(one, two)));
//		System.out.println(one+" "+two+ " " + three + " " + four+ " "+five);
		System.out.println("contains function : "+six.contains(six));
		System.out.println("indexof function : "+one.indexOf("k"));
		System.out.println("Lastindexof function : "+six.lastIndexOf("clever"));
		System.out.println("isEmpty function : "+seven.isEmpty());
		System.out.println("Split function : "+one.split(" "));
		System.out.println("concat function : "+one.concat(" ").concat(  two));
		System.out.println("StartWith function : "+one.startsWith("s"));
		System.out.println("StartWith function : "+one.endsWith("t"));
		char[] d=one.toCharArray();
		System.out.println("StartWith function : "+d[3]);
		
	}
}
