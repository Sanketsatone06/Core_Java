package threadss;

public class ExtendThredDemo extends Thread {
	
	public void run() {
		
		for(int i=10; i<15; i++) {
			
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		 ExtendThredDemo ec = new  ExtendThredDemo();
		 ec.start();
		
	}

}
