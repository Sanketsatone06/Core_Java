package Day_22;


class one extends Thread{
	public void run() {
		
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


class two extends Thread{
	public void run() {
		
		for(int i = 15;i<=20;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class three extends Thread{
	
	public void run() {
		for(int i = 30;i<=45;i++) {
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

public class Multi_threadex1 {
	
	public static void main(String[]args) {
		
		one t1 = new one();
		t1.start();
		
		two t2 = new two();
		t2.start();
		
		three t3 = new three();
		t3.start();
		
	}
	
}
