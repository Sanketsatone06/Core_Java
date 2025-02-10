package practice;

public class Thread_demo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		t.setName("thread 1");
		System.out.println(t.getName());
		
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
			t.sleep(2000);
		}

	}

}
