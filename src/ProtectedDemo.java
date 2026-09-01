// Parent class
class Employee {

    // Protected variable
    protected String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    // Protected method
    protected void displayName() {
        System.out.println("Employee Name: " + name);
    }
}

// Child class
class Manager extends Employee {

    private double salary;

    // Constructor
    Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void displayDetails() {

        // Accessing protected variable from parent class
        System.out.println("Name: " + name);

        // Accessing protected method from parent class
        displayName();

        System.out.println("Salary: " + salary);
    }
}

// Main class
public class ProtectedDemo {

    public static void main(String[] args) {

        Manager m = new Manager("Asni", 50000);

        m.displayDetails();
    }
}