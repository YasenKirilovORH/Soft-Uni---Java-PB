package ExamPractice;

import java.util.Scanner;

public class EP_04_Game_Number_Wars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        String input = scanner.nextLine();
        while (!"End of game".equals(input)) {
            int playerOneCard = Integer.parseInt(input);
            int playerTwoCard = Integer.parseInt(scanner.nextLine());

            if (playerOneCard > playerTwoCard) {
                playerOnePoints += (playerOneCard - playerTwoCard);

            } else if (playerOneCard < playerTwoCard) {
                playerTwoPoints += (playerTwoCard - playerOneCard);

            } else {
                while (playerOneCard == playerTwoCard) {
                    System.out.println("Number wars!");
                    playerOnePoints = 0;
                    playerTwoPoints = 0;
                    playerOneCard = Integer.parseInt(scanner.nextLine());
                    playerTwoCard = Integer.parseInt(scanner.nextLine());

                    if (playerOneCard > playerTwoCard) {
                        System.out.printf("%s is winner with %d points", playerOne, playerOneCard - playerTwoCard);
                        return;
                    } else if (playerTwoCard > playerOneCard) {
                        System.out.printf("%s is winner with %d points", playerTwo, playerTwoCard - playerOneCard);
                        return;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s has %d points\n", playerOne, playerOnePoints);
        System.out.printf("%s has %d points", playerTwo, playerTwoPoints);
    }
}