package day_11;

public class Homework_p3 {
    
    private double length;
    private double width;
    
    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }
    
    // Getter for length
    public double getLength() {
        return length;
    }
    
    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Getter for width
    public double getWidth() {
        return width;
    }
    
    public static void main(String[] args) {
        Homework_p3 obj = new Homework_p3();
        
        obj.setLength(10.5);
        obj.setWidth(5.5);
        
        // Use getter methods to print the values
        System.out.println("Length: " + obj.getLength());
        System.out.println("Width: " + obj.getWidth());
    }
}
