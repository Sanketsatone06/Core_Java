package Collection_Framework;

import java.util.LinkedHashSet;

public class Programme2 {

	public static void main(String[] args) {

		LinkedHashSet<String> link = new LinkedHashSet<String>();
		
		//Add element
		link.add("one");
		link.add("two");
		link.add("three");
		link.add("four");
		link.add("five");
		link.add("six");
		System.out.println(link);
		
		//remove element
		link.remove("six");
		System.out.println(link);
		
		//Checked element
		System.out.println(link.contains("four"));
		
		System.out.println(link.size());

	}

}
