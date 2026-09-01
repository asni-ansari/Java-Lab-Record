// Parent class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Students extends Person {
    String course;

    Student(String name, String course) {
        super(name);       // Calls Person constructor
        this.course = course;
    }

    void displayStudent() {
        super.displayName();   // Calls Person's displayName() method
        System.out.println("Course: " + course);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Asni", "MCA");
        s.displayStudent();
    }
}