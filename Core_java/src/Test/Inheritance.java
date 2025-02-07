package Test;

class person{
	
	String name;
	int age;
	
	public person(String name ,int age) {
		this.name =  name;
		this.age = age;
	}
}

class student extends person{
	String grade;
	
	public student(String name , int age , String grade){
		
		super(name,age);
		this.grade=grade;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		student obj = new student("sanket" ,18,"A+" );
		
		System.out.println("name :" + obj.name);
		System.out.println("age :" + obj.age);
		System.out.println("Grade : " + obj.grade);
		

	}

}
