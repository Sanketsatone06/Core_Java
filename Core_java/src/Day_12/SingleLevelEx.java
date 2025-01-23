package Day_12;

class First{
	public void first() {
		System.out.println("This is First class");
	}
}

class Second extends First{
	public void second() {
		System.out.println("This is second class");
	}
}

public class SingleLevelEx {

	public static void main(String[] args) {
		
		Second singlelevel = new Second();
        
		singlelevel.first();
		singlelevel.second();

	}

}
