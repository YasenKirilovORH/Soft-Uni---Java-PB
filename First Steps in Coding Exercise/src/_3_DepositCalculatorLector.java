import java.util.Scanner;

public class _3_DepositCalculatorLector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (deposit * (rate / 100)) / 12;
        double result = deposit + (period * ratePerMonth);

        System.out.println(result);

    }
}
