package practice;

class Class_A {
    public void method1() {
        System.out.println("This is the super class");
    }
}

 class Class_B extends Class_A {
    public void method2() {
        System.out.println("This is the subclass");
    }
}

public class Single_inheritance {
    public static void main(String[] args) {
        Class_B obj = new Class_B();
        obj.method1();
        obj.method2();
    }
}
