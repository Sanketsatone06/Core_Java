package Day_13;

public class Static_var_ex {
	
	int eid;
	String name;
	static String ceo = "john";
	
	Static_var_ex (int eid , String name){
		System.out.println(eid + " " + name + " " + ceo);
	}

	public static void main(String[] args) {
		
		new Static_var_ex(101,"sona");
		
		ceo = "gems";
		
		new Static_var_ex(102,"mona");

	}

}
