// Parent class
class Animal {

    // Method in parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Class demonstrating method overloading
class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Same method name, but three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        // -------- Method Overloading --------

        Calculator calc = new Calculator();

        System.out.println("Sum of two numbers: " + calc.add(10, 20));

        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));


        // -------- Method Overriding --------

        Animal a = new Dog();

        // Dog's overridden method is called
        a.sound();
    }
}