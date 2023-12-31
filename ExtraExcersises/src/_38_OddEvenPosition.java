import java.util.Scanner;

public class _38_OddEvenPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        double minOdd = Integer.MAX_VALUE;
        double maxOdd = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;

        double sumOdd = 0;
        double sumEven = 0;

        for (int i = 1; i <= numbers; i++) {

            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven += number;
                if (minEven > number) {
                    minEven = number;
                }
                if (maxEven < number) {
                    maxEven = number;
                }

            } else {
                sumOdd += number;
                if (minOdd > number) {
                    minOdd = number;
                }
                if (maxOdd < number) {
                    maxOdd = number;
                }
            }

        }
        System.out.printf("OddSum=%.2f,%n", sumOdd);
        if (minOdd == Integer.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }
        if (maxOdd == Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if (minEven == Integer.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }
        if (maxEven == Integer.MIN_VALUE) {
            System.out.println("EvenMax=No ");
        } else {
            System.out.printf("EvenMax=%.2f%n", maxEven);
        }

    }
}
