//Lab Cycle 1
//Task 2

//Program to calculate Simple Interest and Amount

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double principal, rate, time;
        double simpleInterest, amount;

        // Read input values
        System.out.print("Principal: ");
        principal = input.nextDouble();

        System.out.print("Rate: ");
        rate = input.nextDouble();

        System.out.print("Time: ");
        time = input.nextDouble();

        // Validate inputs
        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Principal, Rate and Time cannot be negative.");
        }
        else {

            // Calculate Simple Interest
            simpleInterest = (principal * rate * time) / 100;

            // Calculate Total Amount
            amount = principal + simpleInterest;

            // Display the result
            System.out.println("\nSimple Interest = " + simpleInterest);
            System.out.println("Amount = " + amount);
        }

        // Close Scanner
        input.close();
    }
}