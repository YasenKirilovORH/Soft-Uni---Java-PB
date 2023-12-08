import java.util.Scanner;

public class _8_TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int wins = 0;

        for (int tournament = 1; tournament <= numberOfTournaments; tournament++) {

            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    wins++;
                    points += 2000;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;

            }
        }
            int totalPoints = points + startingPoints;
            int averagePointsPerTournament = points / numberOfTournaments;

            System.out.printf("Final points: %d%n", totalPoints);
            System.out.printf("Average points: %.0f%n", (double) Math.ceil(averagePointsPerTournament));
            System.out.printf("%.2f%%%n", (double) wins / numberOfTournaments * 100);
        }

    }


