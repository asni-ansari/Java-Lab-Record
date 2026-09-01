// Interface
interface Animal {

    // Abstract method
    void sound();
}

// Class implementing the interface
class Dog implements Animal {

    // Implementing the interface method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InterfaceDemo {

    public static void main(String[] args) {

        // Creating object of Dog
        Dog d = new Dog();

        // Calling the implemented method
        d.sound();
    }
}