import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width;
        double height;

        do {
            System.out.println("Enter the width of the rectangle (must be greater than 0):");
            width = scanner.nextDouble();
        } while (width <= 0);

        do {
            System.out.println("Enter the height of the rectangle (must be greater than 0):");
            //noinspection ReassignedVariable
            height = scanner.nextDouble();
        } while (height <= 0);

        double area = width * height;
        double perimeter = (2 * width) + (2 * height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("--- Rectangle Info ---");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

    }
}