import java.util.Scanner;

public class TravelCostEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance, mileage, petrolPrice;
        double fuelNeeded, cost;

        System.out.print("Enter distance (km): ");
        distance = input.nextDouble();

        System.out.print("Enter mileage (km/litre): ");
        mileage = input.nextDouble();

        System.out.print("Enter petrol price per litre: ");
        petrolPrice = input.nextDouble();

        fuelNeeded = distance / mileage;
        cost = fuelNeeded * petrolPrice;

        System.out.println("Fuel Needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);
    }
}