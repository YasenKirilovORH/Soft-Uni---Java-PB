import java.util.Scanner;

public class _48_ChallengeTheWedding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int man = Integer.parseInt(scanner.nextLine());
        int woman = Integer.parseInt(scanner.nextLine());
        int maxSpace = Integer.parseInt(scanner.nextLine());

        boolean full = false;
        int count = 0;

        for (int i = 1; i <= maxSpace; i++) {
            if (full) {
                break;
            }
            for (int j = 1; j <= man; j++) {
                if (full) {
                    break;
                }
                for (int k = 1; k <= woman; k++) {
                    System.out.printf("(%d <-> %d) ", j, k);
                    count++;
                    if (j == man && k == woman || count == maxSpace) {
                        full = true;
                        break;
                    }
                }
            }
        }

    }
}
