package Day_22;

public class Student_average implements Runnable {

	public static void main(String[] args) {
		
		Student_average obj = new Student_average();
		
		Thread t = new Thread(obj);
		t.start();

	}

	@Override
	public void run() {
		
		int mark1=77;
		int marks2=98;
		int marks3=78;
		
		float avg = (mark1+marks2+marks3)/3;
			
		System.out.println("The student Average is : "+ avg);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
