import java.util.Scanner;

public class _14_TransportPrice {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        double taxi = 0;
        double bus = 0;
        double train = 0;
        double totalSum = 0;

        if (km >= 20 && km < 100) {
            bus = 0.09;
            totalSum = km * bus;
            System.out.printf("%.2f", totalSum);
        } else if (km >= 100) {
            train = 0.06;
            totalSum = km * train;
            System.out.printf("%.2f", totalSum);
        } else if (timeOfTheDay.equals("day")) {
            taxi = 0.79;
            totalSum = (km * taxi) + 0.70;
            System.out.printf("%.2f", totalSum);
        } else if (timeOfTheDay.equals("night")) {
            taxi = 0.90;
            totalSum = (km * taxi) + 0.70;
            System.out.printf("%.2f", totalSum);
        }
    }
}
