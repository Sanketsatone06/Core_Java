package practice;

public class Thread_extend extends Thread {
	
	public void run() {
		for(int i = 10;i<=15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Thread_extend obj  = new Thread_extend();
		obj.start();
	}

}
