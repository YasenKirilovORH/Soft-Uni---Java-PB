import java.util.Scanner;

public class _24_TruckDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble (scanner.nextLine());

        double pricePerKm = 0.00;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 0.75;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    pricePerKm = 0.95;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 0.90;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    pricePerKm = 1.10;
                } else {
                    pricePerKm = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    pricePerKm = 1.05;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    pricePerKm = 1.25;
                } else {
                    pricePerKm = 1.45;
                }
                break;

        }
                double totalPaymentBeforeTax = (kmPerMonth * pricePerKm) * 4;
                double totalPaymentAfterTax = totalPaymentBeforeTax - (totalPaymentBeforeTax * 0.10);
                System.out.printf("%.2f", totalPaymentAfterTax);

    }

}
