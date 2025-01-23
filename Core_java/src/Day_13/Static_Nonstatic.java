package Day_13;

public class Static_Nonstatic{
	static String name = "sanket";
	int age =25;	
	
	class details {
		static void method1() {
			System.out.println(name);
		}
		void method2() {
			System.out.println(age);
		}
	}
	public static void main(String[]args) {
		Static_Nonstatic obj = new Static_Nonstatic();
		Static_Nonstatic.details obj2 = obj.new details();
		
		details.method1();
		obj2.method2();
		}
}
