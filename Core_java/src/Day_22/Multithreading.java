package Day_22;


class multi extends Thread{
	public void run() {
		for(int i =5 ;i<=15;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class multi1 extends Thread{
	public void run() {
		for(int i =25 ;i<=35;i++) {
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

class multi2 extends Thread{
	public void run() {
		for(int i =45 ;i<=55;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithreading {

	public static void main(String[] args) {
		
		multi t1 = new multi();
		t1.start();
		
		multi1 t2 = new multi1();
		t2.start();
		
		multi2 t3 = new multi2();
		t3.start();
		

	}

}
