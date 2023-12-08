import java.util.Scanner;

public class _21_BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int firstNumber = start / 1000 % 10;
        int secondNumber = start / 100 % 10;
        int thirdNumber = start / 10 % 10;
        int forthNumber = start % 10;

        int firstNumberEnd = end / 1000 % 10;
        int secondNumberEnd = end / 100 % 10;
        int thirdNumberEnd = end / 10 % 10;
        int forthNumberEnd = end % 10;


        for (int i = firstNumber; i <= firstNumberEnd; i++) {
            for (int j = secondNumber; j <= secondNumberEnd; j++) {
                    for (int k = thirdNumber; k <= thirdNumberEnd; k++) {
                        for (int l = forthNumber; l <= forthNumberEnd; l++) {

                            if (!(i % 2 == 0) && !(j % 2 == 0) && !(k % 2 == 0) && !(l % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);

                            }

                            }

                        }
                    }
                }

            }

        }





