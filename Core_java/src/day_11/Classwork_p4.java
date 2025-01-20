package day_11;

import java.util.Scanner;

public class Classwork_p4 {
    
    private String name;
    private int age;
    private String country;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter country:");
        String country = sc.nextLine();

        Classwork_p4 obj = new Classwork_p4();
        obj.setName(name);
        obj.setAge(age);
        obj.setCountry(country);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Country: " + obj.getCountry());

    }
}
