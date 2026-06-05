import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter source currency (USD, EUR, PKR): ");
        String from = input.next().toUpperCase();

        System.out.print("Enter target currency (USD, EUR, PKR): ");
        String to = input.next().toUpperCase();

        double result = convert(amount, from, to);

        if (result == -1) {
            System.out.println("Invalid currency conversion!");
        } else {
            System.out.printf("%.2f %s = %.2f %s%n",
                    amount, from, result, to);
        }

        input.close();
    }

    public static double convert(double amount, String from, String to) {

        // Exchange rates relative to USD
        double usd = 1.0;
        double eur = 0.925;
        double pkr = 282.0;

        double amountInUSD;

        switch (from) {
            case "USD":
                amountInUSD = amount;
                break;
            case "EUR":
                amountInUSD = amount / eur;
                break;
            case "PKR":
                amountInUSD = amount / pkr;
                break;
            default:
                return -1;
        }

        switch (to) {
            case "USD":
                return amountInUSD;
            case "EUR":
                return amountInUSD * eur;
            case "PKR":
                return amountInUSD * pkr;
            default:
                return -1;
        }
    }
}

