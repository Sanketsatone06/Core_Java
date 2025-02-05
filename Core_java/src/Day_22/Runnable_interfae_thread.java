package Day_22;

public class Runnable_interfae_thread implements Runnable {

	public static void main(String[] args) {
		
		Runnable_interfae_thread obj = new Runnable_interfae_thread();
		
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
		
		int num=5;
		int table = 0;
		for(int i = 1;i<=10;i++) {
			table = num*i;
			System.out.println(table);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
