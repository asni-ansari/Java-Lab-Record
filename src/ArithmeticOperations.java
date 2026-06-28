//Lab Cycle 1
// Task 8

// Program to perform arithmetic operations

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int a, b;

        // Read two numbers
        System.out.print("A = ");
        a = input.nextInt();

        System.out.print("B = ");
        b = input.nextInt();

        // Check whether the second number is zero
        if (b == 0) {
            System.out.println("Division and modulus by zero are not allowed.");
        }
        else {

            // Perform arithmetic operations
            int addition = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            int division = a / b;
            int modulus = a % b;

            // Display the results
            System.out.println("\nAddition = " + addition);
            System.out.println("Subtraction = " + subtraction);
            System.out.println("Multiplication = " + multiplication);
            System.out.println("Division = " + division);
            System.out.println("Modulus = " + modulus);
        }

        // Close Scanner
        input.close();
    }
}