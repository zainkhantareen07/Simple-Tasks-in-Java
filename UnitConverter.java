import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== UNIT CONVERTER ===");
        System.out.println("1. Length (meter, km, mile)");
        System.out.println("2. Weight (kg, gram, pound)");
        System.out.println("3. Temperature (C, F, K)");

        System.out.print("Enter value: ");
        double value = input.nextDouble();

        System.out.print("Enter unit type (length/weight/temp): ");
        String type = input.next().toLowerCase();

        System.out.print("Convert to unit: ");
        String toUnit = input.next().toLowerCase();

        double result = convert(value, type, toUnit);

        if (Double.isNaN(result)) {
            System.out.println("Invalid conversion!");
        } else {
            System.out.println("Converted Value: " + result + " " + toUnit);
        }

        input.close();
    }

    public static double convert(double value, String type, String toUnit) {

        switch (type) {

            // ---------------- LENGTH ----------------
            case "length":
                return convertLength(value, toUnit);

            // ---------------- WEIGHT ----------------
            case "weight":
                return convertWeight(value, toUnit);

            // -------------- TEMPERATURE -------------
            case "temp":
                return convertTemperature(value, toUnit);

            default:
                return Double.NaN;
        }
    }

    // LENGTH CONVERSION
    public static double convertLength(double value, String to) {

        // base: meter
        switch (to) {
            case "meter":
            case "m":
                return value;

            case "km":
                return value / 1000;

            case "mile":
                return value / 1609.34;

            default:
                return Double.NaN;
        }
    }

    // WEIGHT CONVERSION
    public static double convertWeight(double value, String to) {

        // base: kg
        switch (to) {
            case "kg":
                return value;

            case "gram":
            case "g":
                return value * 1000;

            case "pound":
            case "lb":
                return value * 2.20462;

            default:
                return Double.NaN;
        }
    }

    // TEMPERATURE CONVERSION
    public static double convertTemperature(double value, String to) {

        switch (to) {

            case "c":
                return value;

            case "f":
                return (value * 9 / 5) + 32;

            case "k":
                return value + 273.15;

            default:
                return Double.NaN;
        }
    }
}