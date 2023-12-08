import java.util.Scanner;

public class _12_WorldSnookerChampionship {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        char pictureWithTrophy = scanner.next().charAt(0);

        double ticketPrice = 0;

        switch (stage) {
            case "Quarter final":
                if(ticketType.equals("Standard")) {
                    ticketPrice = 55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.20;
                } else {
                    ticketPrice = 118.90;
                }
                break;

            case "Semi final":
                if(ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else {
                    ticketPrice = 300.40;
                }
                break;

            case "Final":
                if(ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else {
                    ticketPrice = 400;
                }
                break;
        }
        double sum = ticketPrice * numTickets;

        if (sum > 2500 && sum <= 4000) {
            sum = sum - (sum * 0.10);
        } else if (sum > 4000) {
            sum = sum - (sum * 0.25);
            if (pictureWithTrophy == 'Y') {
                sum = sum - 40 * numTickets;
            }
        }
        if (pictureWithTrophy == 'Y') {
            sum = sum + 40 * numTickets;
        }

        System.out.printf("%.2f", sum);
    }

}
