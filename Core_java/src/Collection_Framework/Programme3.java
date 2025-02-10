package Collection_Framework;

import java.util.TreeSet;

public class Programme3 {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>();
		
		//Add element
		tree.add("tone");
		tree.add("two");
		tree.add("three");
		tree.add("four");
		tree.add("five");
		tree.add("six");
		System.out.println(tree);
		
		//remove elemnet
		
		tree.remove("two");
		System.out.println(tree);
		
		//checked elemnet
		System.out.println(tree.contains("five"));
		
		//check size
		System.out.println(tree.size());
		
		//first
		
		System.out.println(tree.first());
		
		//last
		System.out.println(tree.last());
		
		//Descending set
		
		System.out.println(tree.descendingSet());

	}

}
