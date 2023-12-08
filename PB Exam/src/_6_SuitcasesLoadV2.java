import java.util.Scanner;

public class _6_SuitcasesLoadV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        int count = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double luggage = Double.parseDouble(input);

            count++;

            if (count % 3 == 0) {
                luggage = luggage + (luggage * 0.10);
            }
            capacity -= luggage;

            if (capacity < 0) {
                System.out.println("No more space!");
                count--;
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
