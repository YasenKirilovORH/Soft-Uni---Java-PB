import java.util.Scanner;

public class _6_CinemaTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int student = 0;
        int standard = 0;
        int kid = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String movie = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int seatsSold = 0;
            String ticketsType = scanner.nextLine();
            while (!ticketsType.equals("End")) {
                seatsSold++;
                switch (ticketsType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (freeSeats == seatsSold) {
                    break;
                }

                ticketsType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, (double) seatsSold / freeSeats * 100);
            input = scanner.nextLine();
        }
        int totalTickets = student + standard + kid;

        System.out.printf("Total tickets: %d%n", totalTickets);

        System.out.printf("%.2f%% student tickets.%n", (double) student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", (double) kid / totalTickets * 100);


    }

}
