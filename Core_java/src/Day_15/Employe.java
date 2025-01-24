package Day_15;

import java.util.Scanner;

public class Employe {
	

	private int id;
	private String name;
	private int salary;

	
	public void setid(int id) {
		this.id=id;
	}
	
	public int getid() {
		return id;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	public int getsalary() {
		return salary;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employe id : " );
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Employe name : " );
		String name = sc.nextLine();
		
		System.out.println("Enter Employe Salary : " );
		
		int Salary = sc.nextInt();
		
		Employe obj = new Employe();
		
		obj.setid(id);
		obj.setname(name);
		obj.setsalary(Salary);
		
		int id1 = obj.getid();
		String name1 = obj.getname();
		int salary1 = obj.getsalary();
		
		System.out.println("Employe id :"+id1);
		System.out.println("Employe name : "+name1);
		System.out.println("Employe salary : "+salary1);
		

	}

}
