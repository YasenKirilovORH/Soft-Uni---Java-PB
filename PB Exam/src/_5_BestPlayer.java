import java.util.Scanner;

public class _5_BestPlayer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";


        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = input;
            }
            if (goals >= 10) {
                break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", maxGoals);
        }
    }

}
