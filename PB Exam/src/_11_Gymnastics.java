import java.util.Scanner;

public class _11_Gymnastics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double scoreDifficulty = 0;
        double scorePerformance = 0;

        switch (tool) {
            case "ribbon":
                if (country.equals("Russia")) {
                    scoreDifficulty = 9.100;
                    scorePerformance = 9.400;
                } else if (country.equals("Bulgaria")) {
                    scoreDifficulty = 9.600;
                    scorePerformance = 9.400;
                } else {
                    scoreDifficulty = 9.200;
                    scorePerformance = 9.500;
                }
                break;

            case "hoop":
                if (country.equals("Russia")) {
                    scoreDifficulty = 9.300;
                    scorePerformance = 9.800;
                } else if (country.equals("Bulgaria")) {
                    scoreDifficulty = 9.550;
                    scorePerformance = 9.750;
                } else {
                    scoreDifficulty = 9.450;
                    scorePerformance = 9.350;
                }
                break;

            case "rope":
                if (country.equals("Russia")) {
                    scoreDifficulty = 9.600;
                    scorePerformance = 9.000;
                } else if (country.equals("Bulgaria")) {
                    scoreDifficulty = 9.500;
                    scorePerformance = 9.400;
                } else {
                    scoreDifficulty = 9.700;
                    scorePerformance = 9.150;
                }
                break;


        }
        double sum = scoreDifficulty + scorePerformance;
        double pointsNeededToMaxScore = 20 - sum;
        double percentNeededToMaxScore = (pointsNeededToMaxScore / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, sum, tool);
        System.out.printf("%.2f%%", percentNeededToMaxScore);
    }

}
