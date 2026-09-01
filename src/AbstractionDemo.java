// Abstract parent class
abstract class Shape {

    // Abstract method
    // It has no body in the parent class
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class
class Circle extends Shape {

    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Main class
public class AbstractionDemo {

    public static void main(String[] args) {

        // Creating object of child class
        Circle c = new Circle(5);

        // Calling inherited normal method
        c.display();

        // Calling overridden abstract method
        c.area();
    }
}