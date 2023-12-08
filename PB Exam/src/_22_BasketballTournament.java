import java.util.Scanner;

public class _22_BasketballTournament {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int wins = 0;
        int loses = 0;
        int countMatches = 0;

        while (!tournamentName.equals("End of tournaments")) {
        int numGames = Integer.parseInt(scanner.nextLine());
        countMatches += numGames;

        for (int i = 1; i <= numGames; i++) {
            int firstPoints = Integer.parseInt(scanner.nextLine());
            int secondPoints = Integer.parseInt(scanner.nextLine());

            if (firstPoints > secondPoints) {
                wins++;
                System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournamentName, Math.abs(firstPoints - secondPoints));
            } else {
                loses++;
                System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournamentName, Math.abs(firstPoints - secondPoints));
            }

        }


        tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", (double) wins / countMatches * 100);
        System.out.printf("%.2f%% matches lost\n", (double) loses / countMatches * 100);
    }

}
