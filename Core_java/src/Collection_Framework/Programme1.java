package Collection_Framework;

import java.util.HashSet;

public class Programme1 {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		
		
		//add element
		
		hash.add("sanket");
		hash.add("tushar");
		hash.add("kumar");
		hash.add("nayan");
		hash.add("sahil");
		hash.add("jay");
		
		System.out.println(hash);
		
		//remove
		hash.remove("jay");
		System.out.println(hash);
		
		//checked elements
		
		System.out.println(hash.contains("nayan"));
		
		//size of set
		System.out.println(hash.size());
		
		
		
		
		
		

	}

}
