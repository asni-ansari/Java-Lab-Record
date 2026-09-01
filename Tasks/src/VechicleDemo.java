// Parent class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);   // Calls Vehicle constructor
        this.model = model;
    }

    void displayCar() {
        displayBrand();
        System.out.println("Model: " + model);
    }
}

// Main class
public class VechicleDemo {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Fortuner");
        c.displayCar();
    }
}
