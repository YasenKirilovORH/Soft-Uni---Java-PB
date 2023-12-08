import java.util.Scanner;

public class _40_Dishwasher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int count = 0;
        int dishes = 0;
        double detergentPerPlate = 5;
        double detergentPerPot = 15;
        int plate = 0;
        int pot = 0;
        double detergent = Integer.parseInt(input) * 750;
        boolean end = false;

        while (!input.equals("End")) {

            count++;
            if (count > 1) {
                dishes = Integer.parseInt(input);
            } else {
                dishes = Integer.parseInt(scanner.nextLine());
            }
            if (count % 3 == 0) {
                pot += dishes;
                detergent -= dishes * detergentPerPot;
            } else {
                plate += dishes;
                detergent -= dishes * detergentPerPlate;
            }
            if (detergent < 0) {
                end = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (end) {
            detergent = Math.abs(detergent);
            System.out.printf("Not enough detergent, %.0f ml. more necessary!%n", detergent);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plate, pot);
            System.out.printf("Leftover detergent %.0f ml.", detergent);
        }

    }
}


