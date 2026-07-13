//Lab Cycle1
// Task 9

// Program to swap two numbers

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int a, b, temp;

        // Read two numbers
        System.out.print("A = ");
        a = input.nextInt();

        System.out.print("B = ");
        b = input.nextInt();

        // Display numbers before swapping
        System.out.println("\nBefore Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swap using temporary variable
        temp = a;
        a = b;
        b = temp;

        // Display numbers after swapping
        System.out.println("\nAfter Swap (Using Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swap back without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display numbers after swapping again
        System.out.println("\nAfter Swap (Without Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Close Scanner
        input.close();
    }
}