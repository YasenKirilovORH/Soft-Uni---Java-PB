import java.util.Scanner;

public class _19_MatchTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        double transportationExpenses = 0.00;
        double ticketPrice = 0.00;

        if (numberOfPeople <= 4) {
            transportationExpenses = budget * 0.75;
        } else if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            transportationExpenses = budget * 0.60;
        } else if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            transportationExpenses = budget * 0.50;
        } else if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            transportationExpenses = budget * 0.40;
        } else {
            transportationExpenses = budget * 0.25;
        }
        double moneyLeft = budget - transportationExpenses;

        if (category.equals("VIP")) {
            ticketPrice = 499.99;
        } else {
            ticketPrice = 249.99;
        }

        double totalPriceForTickets = ticketPrice * numberOfPeople;

        if (totalPriceForTickets <= moneyLeft) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - totalPriceForTickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPriceForTickets - moneyLeft);
        }

    }

}
