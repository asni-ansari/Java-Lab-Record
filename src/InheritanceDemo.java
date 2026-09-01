// Parent class
class Animal {

    protected String name;

    // Parent class constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void sound() {
        System.out.println(name + " makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Child class constructor
    Dog(String name) {
        super(name);  // Calls parent class constructor
    }

    // Method overriding
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        // Creating Dog object
        Dog d = new Dog("Tommy");

        // Calling overridden method
        d.sound();

        // Polymorphism
        Animal a = new Dog("Bruno");

        // Dynamic method binding
        a.sound();
    }
}