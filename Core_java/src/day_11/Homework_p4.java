package day_11;
public class Homework_p4 {
    // Private instance variable for radius
    private double radius;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object
    	Homework_p4 obj = new Homework_p4();

        // Set the radius
    	obj.setRadius(6);
    	
    	 System.out.println("radius: " + obj.getRadius());

        // Display the area and circumference
        System.out.println("Area: " + obj.calculateArea());
        System.out.println("Circumference: " + obj.calculateCircumference());
    }
}
