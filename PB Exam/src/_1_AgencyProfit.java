import java.util.Scanner;

public class _1_AgencyProfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String companyName = scanner.nextLine();
        int ticketsForAdults = Integer.parseInt(scanner.nextLine());
        int ticketsForKids = Integer.parseInt(scanner.nextLine());
        double netPriceForAdults = Double.parseDouble(scanner.nextLine());
        double taxForService = Double.parseDouble(scanner.nextLine());

        double netPriceForKids = netPriceForAdults * 0.30;

        double ticketPriceForAdultWithService = netPriceForAdults + taxForService;
        double ticketPriceForKidWithService = netPriceForKids + taxForService;

        double totalSum = ticketPriceForAdultWithService * ticketsForAdults + ticketPriceForKidWithService * ticketsForKids;

        double companyProfit = totalSum * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, companyProfit);

    }

}
