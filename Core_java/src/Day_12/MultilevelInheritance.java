package Day_12;

// Base class
class Multilevel {
    public void method1() {
        System.out.println("This is my class_A");
    }
}

// Derived class from Multilevel
class Class_b extends Multilevel {
    public void method2() {
        System.out.println("This is my class_B");
    }
}

// Main class to demonstrate inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Class_b bobj = new Class_b();
        bobj.method1(); // Method from Multilevel class
        bobj.method2(); // Method from Class_b class
    }
}
