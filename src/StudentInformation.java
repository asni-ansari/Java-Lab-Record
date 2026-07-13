//Lab Cycle 1
//Task 1

// Program to read and display student details

import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        String name, course;
        int rollNo;
        double percentage;

        // Read student details
        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Roll No: ");
        rollNo = input.nextInt();

        // Consume the newline character left by nextInt()
        input.nextLine();

        System.out.print("Course: ");
        course = input.nextLine();

        System.out.print("Percentage: ");
        percentage = input.nextDouble();

        // Validate percentage
        if (percentage < 0 || percentage > 100) {
            System.out.println("Percentage should be between 0 and 100.");
        }
        else {
            // Display student details
            System.out.println("\nStudent Details");
            System.out.println("---------------");
            System.out.println("Name       : " + name);
            System.out.println("Roll No    : " + rollNo);
            System.out.println("Course     : " + course);
            System.out.println("Percentage : " + percentage);
        }

        // Close Scanner
        input.close();
    }
}
