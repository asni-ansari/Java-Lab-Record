//Lab Cycle 1
// Task 5

// Program to calculate Employee Salary

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double basicSalary, da, hra, grossSalary;

        // Read basic salary
        System.out.print("Basic Salary: ");
        basicSalary = input.nextDouble();

        // Check whether salary is valid
        if (basicSalary < 0) {
            System.out.println("Salary cannot be negative.");
        }
        else {

            // Calculate DA (10%)
            da = basicSalary * 10 / 100;

            // Calculate HRA (15%)
            hra = basicSalary * 15 / 100;

            // Calculate Gross Salary
            grossSalary = basicSalary + da + hra;

            // Display the result
            System.out.println("\nDA = " + da);
            System.out.println("HRA = " + hra);
            System.out.println("Gross Salary = " + grossSalary);
        }

        // Close Scanner
        input.close();
    }
}