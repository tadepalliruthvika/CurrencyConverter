import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("Available conversions:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0.0;
        switch (choice) {
            case 1:
                convertedAmount = amount * 83.12; // 1 USD = 83.12 INR
                System.out.printf("USD %.2f = INR %.2f\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount / 83.12;
                System.out.printf("INR %.2f = USD %.2f\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * 89.75; // 1 EUR = 89.75 INR
                System.out.printf("EUR %.2f = INR %.2f\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount / 89.75;
                System.out.printf("INR %.2f = EUR %.2f\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
