import java.util.Scanner;

public class _35_EqualPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int secondSum = 0;
        int maxDifference = 0;

        for (int i = 1; i <= number; i++) {

        int inputNumber1 = Integer.parseInt(scanner.nextLine());
        int inputNumber2 = Integer.parseInt(scanner.nextLine());

        if ( i % 2 == 0) {
            secondSum = inputNumber2 + inputNumber1;
        } else {
            firstSum = inputNumber1 + inputNumber2;
        }
        if (i > 1) {
            if (firstSum != secondSum) {
                maxDifference = Math.abs (firstSum - secondSum);
            }
        }
        }
        if (maxDifference == 0) {
            System.out.printf("Yes, value=%d", firstSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }

    }

}
