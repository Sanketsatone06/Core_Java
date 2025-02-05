package Day_22;


class sum implements Runnable {
	
	public void run() {
		int sum =0 ;
		
		for(int i =1;i<=10;i++) {
			 sum+=i;
			 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sum of number 1 to 10 is : " + sum );
	}
		
	}
public class Sum1to10 {

	public static void main(String[] args) {
		sum obj = new  sum();
		Thread thread = new Thread(obj);
		thread.start();
		
		
	}

}
