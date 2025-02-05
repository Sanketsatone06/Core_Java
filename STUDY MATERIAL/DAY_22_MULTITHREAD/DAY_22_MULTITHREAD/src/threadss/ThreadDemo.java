package threadss;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
		Thread t= Thread.currentThread();
		
		for(int i=1; i<5; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}

}
