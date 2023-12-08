import java.util.Scanner;

public class _13_GameNumberWars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1stPlayer = scanner.nextLine();
        String name2ndPlayer = scanner.nextLine();

        String card1 = scanner.nextLine();

        int points1 = 0;
        int points2 = 0;

        while (!card1.equals("End of game")) {
            String card2 = scanner.nextLine();

            int points1st = Integer.parseInt(card1);
            int points2nd = Integer.parseInt(card2);

            if (points1st > points2nd) {
                points1 += points1st - points2nd;
            } else if (points1st < points2nd) {
                points2 += points2nd - points1st;
            } else {
                System.out.println("Number wars!");
                String lastCard1 =scanner.nextLine();
                String lastCard2 = scanner.nextLine();

                if (Integer.parseInt(lastCard1) > Integer.parseInt(lastCard2)) {
                    System.out.printf("%s is winner with %d points", name1stPlayer, points1);
                    break;
                } else {
                    System.out.printf("%s is winner with %d points", name2ndPlayer, points2);
                    break;
                }
            }
            card1 = scanner.nextLine();
        }
        if (card1.equals("End of game")) {
            System.out.printf("%s has %d points%n", name1stPlayer, points1);
            System.out.printf("%s has %d points%n", name2ndPlayer, points2);
        }

    }

}
