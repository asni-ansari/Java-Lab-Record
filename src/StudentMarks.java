import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark1, mark2, mark3, total;
        double average;

        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = sc.nextInt();

        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + average);

        if (average >= 50) {
            System.out.println("Student scored above 50 average");
        } else {
            System.out.println("Student did not score above 50 average");
        }

        sc.close();
    }
}