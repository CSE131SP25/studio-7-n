package studio7;

public class Rectangle {

	double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to display rectangle details
    public void displayInfo() {
        System.out.println("length: " + length + ", width: " + width);
    }

}