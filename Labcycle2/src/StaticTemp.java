import java.util.Scanner;

public class StaticTemp {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}