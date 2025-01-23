package Day_12;

class Grand_Parent{
	
	public void grandparent() {
		System.out.println("Hi i'am grand parent");
	}
}

class Parent extends Grand_Parent {
	public void parent() {
		System.out.println("Hi i'am parent");
	}
}

class Child extends Parent{
	public void child() {
		System.out.println("Hi i'am child");
	}
}


public class GrandParent {

	public static void main(String[] args) {
		
		Child family = new Child();
		
		family.grandparent();
		family.parent();
		family.child();

	}

}

