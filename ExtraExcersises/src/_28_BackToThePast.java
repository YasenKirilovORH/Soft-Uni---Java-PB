import java.util.Scanner;

public class _28_BackToThePast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int currentYears = 18;
        double currentAmount = inheritance;
        double spendMoney = 0;

        for (int year = 1800; year <= yearToLive; year++) {

            double moneyLeft = 0;

            if (year % 2 == 0) {
                currentAmount -= 12000;
            } else {
                spendMoney = 12000 + (currentYears * 50);
                currentAmount -= spendMoney;
            }
            currentYears++;

        }
            if (currentAmount >= 0) {
                System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", currentAmount);
            } else {
                System.out.printf("He will need %.2f dollars to survive.", Math.abs(currentAmount));
            }

    }

}
