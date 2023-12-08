import java.util.Scanner;

public class _20_BikeRace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int youngBikers = Integer.parseInt(scanner.nextLine());
        int adultBikers = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double totalProfit = 0.00;

        switch (trace) {
            case ("trail"):
                totalProfit = youngBikers * 5.50 + adultBikers * 7.00;
                break;
            case ("cross-country"):
                totalProfit = youngBikers * 8.00 + adultBikers * 9.50;
                if (youngBikers + adultBikers >= 50) {
                    totalProfit = totalProfit - (totalProfit * 0.25);
                }
                break;
            case ("downhill"):
                totalProfit = youngBikers * 12.25 + adultBikers * 13.75;
                break;
            case ("road"):
                totalProfit = youngBikers * 20.00 + adultBikers * 21.50;
                break;

        }
                double profitAfterTax = totalProfit - (totalProfit * 0.05);

        System.out.printf("%.2f", profitAfterTax);
    }

}
