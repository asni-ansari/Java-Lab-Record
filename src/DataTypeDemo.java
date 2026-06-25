import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer value: ");
        int i = input.nextInt();

        System.out.print("Enter Long value: ");
        long l = input.nextLong();

        System.out.print("Enter Float value: ");
        float f = input.nextFloat();

        System.out.print("Enter Double value: ");
        double d = input.nextDouble();

        System.out.print("Enter Character: ");
        char c = input.next().charAt(0);

        System.out.print("Enter Boolean (true/false): ");
        boolean b = input.nextBoolean();

        System.out.println("\nInteger value : " + i);
        System.out.println("Long value    : " + l);
        System.out.println("Float value   : " + f);
        System.out.println("Double value  : " + d);
        System.out.println("Character     : " + c);
        System.out.println("Boolean       : " + b);
    }
}