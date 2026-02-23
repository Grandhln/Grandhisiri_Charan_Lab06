import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons;
        double mpg;
        double pricePerGallon;

        do {
            System.out.println("Enter the number of gallons of gas in the tank (must be greater than 0):");
            gallons = scanner.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.println("Enter the fuel efficiency in miles per gallon (must be greater than 0):");
            mpg = scanner.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.println("Enter the price of gas per gallon (must be greater than 0):");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        float costFor100Miles = (float) ((100.0 / mpg) * pricePerGallon);

        double totalDistance = gallons * mpg;

        System.out.println("--- Results ---");
        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Total distance with a full tank: " + totalDistance + " miles");
    }
}