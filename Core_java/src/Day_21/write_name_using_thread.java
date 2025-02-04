package Day_21;

public class write_name_using_thread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		t.setName("Sanket");
		System.out.println(t.getName());

	}

}
