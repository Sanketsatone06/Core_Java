package Static;

public class StaticvarEx {
	
	int eid;
	String name;
	static String ceo ="john";
	
	StaticvarEx(int eid,String name){
		
		System.out.println(eid+"  " +name+"  " +ceo);
	}

	public static void main(String[] args) {
		
		new StaticvarEx(101,"sona");
	     
		ceo ="Gems";
		
		new StaticvarEx(102,"tony");

	}

}
