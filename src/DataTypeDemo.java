//Lab Cycle 1
// Task 4

// Program to demonstrate different data types in Java

import java.util.Scanner;

public class DataTypeDemo {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int integerValue;
        long longValue;
        float floatValue;
        double doubleValue;
        char character;
        boolean boolValue;

        // Read values from user
        System.out.print("Enter Integer value: ");
        integerValue = input.nextInt();

        System.out.print("Enter Long value: ");
        longValue = input.nextLong();

        System.out.print("Enter Float value: ");
        floatValue = input.nextFloat();

        System.out.print("Enter Double value: ");
        doubleValue = input.nextDouble();

        System.out.print("Enter Character: ");
        character = input.next().charAt(0);

        System.out.print("Enter Boolean (true/false): ");
        boolValue = input.nextBoolean();

        // Display values
        System.out.println("\nInteger value : " + integerValue);
        System.out.println("Long value    : " + longValue);
        System.out.println("Float value   : " + floatValue);
        System.out.println("Double value  : " + doubleValue);
        System.out.println("Character     : " + character);
        System.out.println("Boolean       : " + boolValue);

        // Display memory size
        System.out.println("\nMemory Size of Data Types");
        System.out.println("int       : 4 bytes");
        System.out.println("long      : 8 bytes");
        System.out.println("float     : 4 bytes");
        System.out.println("double    : 8 bytes");
        System.out.println("char      : 2 bytes");
        System.out.println("boolean   : JVM dependent");

        // Close Scanner
        input.close();
    }
}