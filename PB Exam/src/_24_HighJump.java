import java.util.Scanner;

public class _24_HighJump {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int startingHeight = goal - 30;
        int countJumps = 0;
        boolean isFailed = false;

        while (startingHeight <= goal) {
            for (int i = 0; i < 3; i++) {
                int currentJump = Integer.parseInt(scanner.nextLine());
                countJumps++;
                if (currentJump > startingHeight) {
                    startingHeight += 5;
                    break;
                }
                if (i == 2) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.",startingHeight, countJumps);
                    isFailed = true;
                }
            }
            if (isFailed) {
                break;
            }
        }
            if (!isFailed) {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goal, countJumps);
            }
    }

}
