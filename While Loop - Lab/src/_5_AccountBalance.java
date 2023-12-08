import java.util.Scanner;

public class _5_AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String deposit = scanner.nextLine();
        double totalMoney = 0;


        while (!deposit.equals("NoMoreMoney")) {

            double sum = Double.parseDouble(deposit);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalMoney += sum;
            System.out.printf("Increase: %.2f%n", sum);

            deposit = scanner.nextLine();

        }
            System.out.printf("Total: %.2f", totalMoney);

    }

}
