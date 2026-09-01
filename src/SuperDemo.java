// Parent class
class Person {

    protected String name;

    // Parent class constructor
    Person(String name) {
        this.name = name;
    }

    // Parent class method
    void display() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {

    private int mark;

    // Child class constructor
    Student(String name, int mark) {

        // Calls the parent class constructor
        super(name);

        this.mark = mark;
    }

    // Overriding parent method
    @Override
    void display() {

        // Calls the parent class method
        super.display();

        System.out.println("Mark: " + mark);
    }

    void showParentName() {

        // Accessing parent class variable using super
        System.out.println("Parent class name: " + super.name);
    }
}

// Main class
public class SuperDemo {

    public static void main(String[] args) {

        Student s = new Student("Asni", 85);

        s.display();

        s.showParentName();
    }
}