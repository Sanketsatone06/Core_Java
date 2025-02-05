package threadss;

class A implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}

class B implements Runnable{

	@Override
	public void run() {
		for(int i=50;i<=55;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
class C implements Runnable{

	@Override
	public void run() {
		
		for(int i=21; i>=11; i--) {
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

public class MultirunnableEx {

	public static void main(String[] args) {
		A o1= new A();
		Thread t= new Thread(o1);
		t.start();
		
    B t1 = new B();
    Thread t2 = new Thread(t1);
    t2.start();
    
    C o2 = new C();
    Thread t3 = new Thread(o2);
    t3.start();
    
    
	}

}
