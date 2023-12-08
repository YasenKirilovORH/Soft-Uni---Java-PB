import java.util.Scanner;

public class _14_Darts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int totalPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        while (totalPoints !=0) {
            String field = scanner.nextLine();
            if (field.equals("Retire")) {
                break;
        }
        int points = Integer.parseInt(scanner.nextLine());
            if (field.equals("Triple")) {
                points *= 3;
            } else if (field.equals("Double")) {
                points *= 2;
            }
            if (totalPoints - points >= 0) {
                totalPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }
        }
            if (totalPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successfulShots);
            } else {
                System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShots);
            }




    }

}
