import java.util.Scanner;

public class _2_AddBags {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceOver20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int numLuggage = Integer.parseInt(scanner.nextLine());

        double luggagePrice = 0;

        if (luggageKg < 10) {
            luggagePrice = priceOver20Kg * 0.20;
        } else if (luggageKg <= 20) {
            luggagePrice = priceOver20Kg * 0.50;
        } else {
            luggagePrice = priceOver20Kg;
        }

        if (daysUntilTrip < 7) {
            luggagePrice = luggagePrice + (luggagePrice * 0.40);
        } else if (daysUntilTrip <= 30) {
            luggagePrice = luggagePrice + (luggagePrice * 0.15);
        } else {
            luggagePrice = luggagePrice + (luggagePrice * 0.10);
        }
        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * numLuggage);
    }

}
