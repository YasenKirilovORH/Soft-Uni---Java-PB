import java.util.Scanner;

public class _6_Oscars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgesTotal = Integer.parseInt(scanner.nextLine());

        double maxPoints = 1250.5;

        for (int judge = 1; judge <= judgesTotal; judge ++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            judgePoints = (judgeName.length() * judgePoints) / 2;
            points += judgePoints;

            if (points >= maxPoints) {
                break;

            }

        }
        if (points >= maxPoints) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, maxPoints - points);
        }

    }

}
