// Program to demonstrate Runtime Polymorphism using Employee

class Employee {

    // Method to be overridden
    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

// Subclass Manager
class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = Rs. 80,000");
    }
}

// Subclass Developer
class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = Rs. 60,000");
    }
}

// Subclass Intern
class Intern extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Intern Salary = Rs. 15,000");
    }
}

// Main class
public class EmployeeDemo {

    public static void main(String[] args) {

        // Employee reference pointing to Manager object
        Employee emp;

        emp = new Manager();
        emp.calculateSalary();

        // Employee reference pointing to Developer object
        emp = new Developer();
        emp.calculateSalary();

        // Employee reference pointing to Intern object
        emp = new Intern();
        emp.calculateSalary();
    }
}