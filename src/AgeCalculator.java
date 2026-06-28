import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentYear, currentMonth;
        int birthYear, birthMonth;

        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter current month (1-12): ");
        currentMonth = input.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        birthMonth = input.nextInt();

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("Age = " + years + " years and " + months + " months");
    }
}