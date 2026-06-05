import java.util.Scanner; // Required to read user input

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read console input
        Scanner scanner = new Scanner(System.in);

        // Display a menu to the user
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        
        int choice = scanner.nextInt();

        // Check user selection and perform the calculation
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        } else {
            System.out.println("Invalid selection. Please run the program again and choose 1 or 2.");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
