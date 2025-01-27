package Day_16;

public class Print_number {

	
	Print_number (int num){
		System.out.println("intiger datatype : "+num);
	}
	
	Print_number(float num1){
		System.out.println("float datatype : "+num1);
	}
	
	Print_number(double num2){
		System.out.println("Double datatype : "+num2);
	}
	
	Print_number(long num3){
		System.out.println("long datatype : "+num3);
	}
	public static void main(String[]args) {
		
		
		new Print_number(1);
		new Print_number(12.5f);
		new Print_number(12.55555);
		new Print_number(1234567800);
		
	}
}
