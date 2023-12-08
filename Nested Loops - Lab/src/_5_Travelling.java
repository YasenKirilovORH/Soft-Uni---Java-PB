import java.util.Scanner;

public class _5_Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();


        while (!destination.equals("End")) {

            double budgetNeeded = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (savedMoney < budgetNeeded) {
                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney += sum;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }

    }

}
