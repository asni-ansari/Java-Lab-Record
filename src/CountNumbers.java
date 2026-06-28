//Lab Cycle 1
// Task 7

// Program to count positive, negative and zero numbers using enhanced for loop

import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int n;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Read the size of the array
        System.out.print("N = ");
        n = input.nextInt();

        // Check whether the array size is valid
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
        }
        else {

            // Create the array
            int[] arr = new int[n];

            // Read array elements
            System.out.println("Array:");

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            // Count positive, negative and zero numbers
            // using enhanced for loop
            for (int num : arr) {

                if (num > 0) {
                    positive++;
                }
                else if (num < 0) {
                    negative++;
                }
                else {
                    zero++;
                }
            }

            // Display the result
            System.out.println("\nPositive numbers = " + positive);
            System.out.println("Negative numbers = " + negative);
            System.out.println("Zeros = " + zero);
        }

        // Close Scanner
        input.close();
    }
}