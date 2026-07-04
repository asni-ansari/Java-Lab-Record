class Circle {
    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

public class ReturnCircleObject {

    static Circle calculateCircle(double radius) {
        return new Circle(radius);
    }

    public static void main(String[] args) {
        Circle c = calculateCircle(7);

        System.out.printf("Radius = %.1f%n", c.radius);
        System.out.printf("Area = %.2f%n", c.area);
    }
}