package Day_22;

public class Hello_world extends Thread {
	
	
	public void run() {
	System.out.println("Hello world");
}

	public static void main(String[] args) {
		
		Hello_world  obj = new Hello_world();
		obj.start();
		
	}

}
