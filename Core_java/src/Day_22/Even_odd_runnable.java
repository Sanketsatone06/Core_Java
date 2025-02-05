package Day_22;

public class Even_odd_runnable implements Runnable {
	
	

	public static void main(String[] args) {
		
		Even_odd_runnable obj = new Even_odd_runnable();
		
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
		
		for(int i = 1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
