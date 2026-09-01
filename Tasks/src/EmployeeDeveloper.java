// Parent class
class Employee {
    String company = "TCS";
}

// Child class
class Developer extends Employee {
    String company = "Infosys";

    void displayCompany() {
        System.out.println("Child Company: " + company);
        System.out.println("Parent Company: " + super.company);
    }
}

// Main class
public class EmployeeDeveloper {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.displayCompany();
    }
}
