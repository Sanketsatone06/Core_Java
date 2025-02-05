package threadss;

class One extends Thread
{
	public void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+" one ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}

class Two extends Thread{
	
	
public void run() {
		
		for(int i=11; i<15; i++) {
			
			System.out.println(i +" two ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}

class Three extends Thread{
	
	
public void run() {
		
		for(int i=21; i<25; i++) {
			
			System.out.println(i +" three");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MultithredEx {

	public static void main(String[] args) {
		
		 One  o1= new  One ();
		 o1.start();
		 
		 Two t2 = new Two();
		 t2.start();
		 
		 Three t3 = new Three();
		 t3.start();
		

	}

}
