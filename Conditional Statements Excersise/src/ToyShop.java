import java.util.Scanner;


    public class ToyShop {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Inputs
            double vacationPrice = Double.parseDouble(scanner.nextLine());
            int puzzles = Integer.parseInt(scanner.nextLine());
            int dolls = Integer.parseInt(scanner.nextLine());
            int bears = Integer.parseInt(scanner.nextLine());
            int minions = Integer.parseInt(scanner.nextLine());
            int trucks = Integer.parseInt(scanner.nextLine());

            int toysCount = puzzles + dolls + bears + minions + trucks;

            // Prices
            double puzzlePrice = puzzles * 2.60;
            double dollPrice = dolls * 3;
            double bearPrice = bears * 4.10;
            double minionPrice = minions * 8.20;
            double truckPrice = trucks * 2;

            // Calculations
            double sum = puzzlePrice + dollPrice + bearPrice + minionPrice + truckPrice;

            if (toysCount >= 50) {
                sum = sum - (sum * 0.25);
            }

            double rent = sum * 0.10;

            double moneyForVacation = sum - rent;
            double difference = Math.abs(vacationPrice - moneyForVacation);

            if (vacationPrice <= moneyForVacation) {
                System.out.printf("Yes! %.2f lv left.", difference);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", difference);
            }
        }
    }


