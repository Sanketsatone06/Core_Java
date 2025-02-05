package Day_22;

public class Extend_thread extends Thread {
	
	public void run() {
		
		
		for(int i=1;i<=10;i++) {
			int table = i*3;
			System.out.println(table);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Extend_thread obj = new Extend_thread();
		obj.start();
		
	}

}
