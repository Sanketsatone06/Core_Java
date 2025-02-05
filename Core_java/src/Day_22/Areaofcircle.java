package Day_22;

import java.util.Scanner;

class circle extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		
		float radius = sc.nextFloat();
		
		float area = (float) (Math.PI*radius*radius);
		
		System.out.println("Area of circle is : " + area);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Areaofcircle  {

	public static void main(String[] args) {
		
		circle obj = new circle();
		obj.start();

	}

}
