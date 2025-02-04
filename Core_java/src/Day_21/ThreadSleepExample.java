
package Day_21;

public class ThreadSleepExample{
   


    public static void main(String[] args) throws InterruptedException {
    	
    	
    	
    	Thread t = Thread.currentThread();
    	for(int i =1;i<=10;i++) {
    		int Table1 = i*5; 
    		System.out.println(Table1);
    		t.sleep(4000);
    	}
}
}
