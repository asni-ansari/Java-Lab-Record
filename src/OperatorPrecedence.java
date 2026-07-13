//Lab Cycle 1
// Task 10

// Program to demonstrate operator precedence

import java.util.Scanner;

public class OperatorPrecedence {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int a, b, c, d, e, result;

        // Read input values
        System.out.print("A = ");
        a = input.nextInt();

        System.out.print("B = ");
        b = input.nextInt();

        System.out.print("C = ");
        c = input.nextInt();

        System.out.print("D = ");
        d = input.nextInt();

        System.out.print("E = ");
        e = input.nextInt();

        // Check whether divisor is zero
        if (e == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        else {

            // Evaluate the expression
            result = a + b * c - d / e;

            // Display the result
            System.out.println("\nResult = " + result);
        }

        // Close Scanner
        input.close();
    }
}