package Day_13;

public class classworkp_3{
	static String bike = "gt";
	static int cc = 650;
	
	static class second{
		static void method1() {
			System.out.println(bike+ " "+cc);
		}
		void method2() {
			System.out.println(cc);
		}
	}
	
	public static void main(String[]args) {
		classworkp_3.second s = new classworkp_3.second();
		s.method1();
		s.method2();
	}
	
}

