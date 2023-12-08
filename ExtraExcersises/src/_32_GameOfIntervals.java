import java.util.Scanner;

public class _32_GameOfIntervals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double between0And9 = 0;
        double between10And19 = 0;
        double between20And29 = 0;
        double between30And39 = 0;
        double between40And50 = 0;
        double invalid = 0;
        double sum = 0;

        for (int move = 1; move <= moves; move++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                sum = sum / 2;
                invalid++;
            } else if (number < 10) {
                sum = sum + (number * 0.20);
                between0And9++;
            } else if (number < 20) {
                sum = sum + (number * 0.30);
                between10And19++;
            } else if (number < 30) {
                sum = sum + (number * 0.40);
                between20And29++;
            } else if (number < 40) {
                sum = sum + 50;
                between30And39++;
            } else if (number <= 50) {
                sum = sum + 100;
                between40And50++;
            } else {
                sum = sum / 2;
                invalid++;
            }

        }
        double percent0To9 = (between0And9 / moves) * 100;
        double percent10To19 = (between10And19 / moves) * 100;
        double percent20To29 = (between20And29 / moves) * 100;
        double percent30To39 = (between30And39 / moves) * 100;
        double percent40To50 = (between40And50 / moves) * 100;
        double percentInvalid = (invalid / moves) * 100;

        System.out.printf("%.2f%n", sum);
        System.out.printf("From 0 to 9: %.2f%%%n", percent0To9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10To19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20To29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30To39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40To50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalid);
    }
}
