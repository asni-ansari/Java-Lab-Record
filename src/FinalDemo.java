// Parent class declared as final
// No other class can extend this class
final class Animal {

    // Final method
    // This method cannot be overridden
    final void sound() {
        System.out.println("Animal makes a sound");
    }
}

// The following is NOT allowed because Animal is final
// class Dog extends Animal {
// }


// Main class
public class FinalDemo {

    public static void main(String[] args) {

        // Creating object of final class
        Animal a = new Animal();

        // Calling final method
        a.sound();
    }
}