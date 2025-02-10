package practice;

public class Runnable_ex implements Runnable {

	public static void main(String[] args) {
		
		Runnable_ex rn = new Runnable_ex();
		
		
		Thread t = new Thread(rn);
		t.start();

	}

	@Override
	public void run() {
		
		int num=5;
		int table = 0;
		for(int i=1;i<=10;i++) {
			table=num*i;
			System.out.println(table);
			try {
				Thread.sleep(1500);	
			}catch(InterruptedException e){
				
				e.printStackTrace();
				
			}
		}
		
	}

}
