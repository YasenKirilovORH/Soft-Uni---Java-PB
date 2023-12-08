import java.util.Scanner;

public class _47_CarNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                for (int k = num1; k <= num2; k++) {
                    for (int l = num1; l <= num2; l++) {

                        if (i % 2 == 0 && !(l % 2 == 0) || !(i % 2 == 0) && l % 2 == 0) {
                            if (i > l && (j + k) % 2 == 0) {

                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }

            }

        }

    }
}