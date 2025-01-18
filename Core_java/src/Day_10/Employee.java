package Day_10;
public class Employee {
    // Attributes
    public String name;
    public int basicSalary;
    public int bonus;

    // Constructor
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = (int) basicSalary;
        this.bonus = (int) bonus;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to calculate gross salary
    public double grossSalary() {
        double gross = basicSalary + (0.5 * bonus);
        return gross;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Sanket Satone is  :", 50000, 10000);
        
        // Calculate and display the gross salary
        System.out.println("Gross Salary of " + emp.getName() + ": " + emp.grossSalary());
    }
}
