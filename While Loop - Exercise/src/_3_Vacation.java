import java.util.Scanner;

public class _3_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int days = 0;

        while (currentMoney < moneyForVacation) {
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            days++;
            switch (command) {
                case "spend":
                    currentMoney -= amount;
                    spendCount++;
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }

                    break;
                case "save":
                    currentMoney += amount;
                    spendCount = 0;
                    break;


            }
            if (spendCount == 5) {
                break;
            }
        }
        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}