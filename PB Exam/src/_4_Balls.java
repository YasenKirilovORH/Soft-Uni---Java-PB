import java.util.Scanner;

public class _4_Balls {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;
        double points = 0;

        for (int n = 1; n <= number; n++) {
            String ballColor = scanner.nextLine();
            if (ballColor.equals("red")) {
            points+=5;
            redBalls++;
            } else if (ballColor.equals("orange")) {
                points+=10;
                orangeBalls++;
            } else if (ballColor.equals("yellow")) {
                points+=15;
                yellowBalls++;
            } else if (ballColor.equals("white")) {
                points+=20;
                whiteBalls++;
            } else if (ballColor.equals("black")) {
                points = Math.floor (points / 2);
                blackBalls++;
            } else {
                otherBalls++;
            }


        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d%n", blackBalls);

    }

}
