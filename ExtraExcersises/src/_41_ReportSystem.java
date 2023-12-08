import java.util.Scanner;

public class _41_ReportSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalSumNeeded = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        int totalSum = 0;
        int numCashPayments = 0;
        int numCardPayments = 0;

        int totalCashPayments = 0;
        int totalCardPayments = 0;

        int numPayments = 0;

        while (!input.equals("End")) {
            int currentPayment = Integer.parseInt(input);
            numPayments++;
            if (numPayments % 2 == 0) {
                if (currentPayment < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    numCardPayments ++;
                    totalCardPayments += currentPayment;
                    System.out.println("Product sold!");
                    totalSum += currentPayment;
                }
            } else {
                if (currentPayment > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    numCashPayments++;
                    totalCashPayments += currentPayment;
                    System.out.println("Product sold!");
                    totalSum += currentPayment;
                }
            }
            if (totalSum >= totalSumNeeded) {
                System.out.printf("Average CS: %.2f%n", (double) totalCashPayments / numCashPayments);
                System.out.printf("Average CC: %.2f%n", (double) totalCardPayments / numCardPayments);
                break;
            }
            input=scanner.nextLine();
        }
            if (totalSum < totalSumNeeded) {
                System.out.println("Failed to collect required money for charity.");
            }
    }

}
