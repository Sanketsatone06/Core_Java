package practice;

import java.util.Scanner;

public class Getter_and_setter_encapsulation {
	
	private String name;
	
	public void setName(String name_1) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  name : ");
		
		String name = sc.nextLine();
		
		Getter_and_setter_encapsulation obj = new Getter_and_setter_encapsulation();
		obj.setName(name);
		
		String name1 = obj.getName();
		System.out.println("my name is : "+name);

	}

}
