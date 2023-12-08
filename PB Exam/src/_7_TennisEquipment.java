import java.util.Scanner;

public class _7_TennisEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double priceRocket = Double.parseDouble(scanner.nextLine());
        int numRockets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double priceSneakers = (priceRocket / 6) * sneakers;
        double priceRockets = priceRocket * numRockets;
        double priceForOtherEquipment =  (priceRockets + priceSneakers) * 0.20;

        double totalSum = priceRockets + priceSneakers + priceForOtherEquipment;

        double pricePaidByPlayer = Math.floor(totalSum / 8);
        double pricePaidBySponsors = Math.ceil(totalSum * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f%n", pricePaidByPlayer);
        System.out.printf("Price to be paid by sponsors %.0f", pricePaidBySponsors);


    }

}
