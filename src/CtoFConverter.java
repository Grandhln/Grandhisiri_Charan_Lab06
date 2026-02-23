import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args)
    {
        float celsius;
        float fahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Temperature (in Celsius): ");
        celsius = scan.nextFloat();

        fahrenheit = (float) ((celsius*1.8)+32);

        System.out.println("Equivalent Temperature (in Fahrenheit) = " +fahrenheit);
    }
}
