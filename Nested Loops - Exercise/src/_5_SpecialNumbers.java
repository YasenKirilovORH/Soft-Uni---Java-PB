import java.util.Scanner;

public class _5_SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1111; i <= 9999; i++) {

            int firstNumber = i / 1000 % 10;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int forthNumber = i  % 10;

            boolean first = number % firstNumber == 0;
            boolean second = secondNumber != 0 && number % secondNumber == 0;
            boolean third = thirdNumber != 0 && number % thirdNumber == 0;
            boolean forth = forthNumber != 0 && number % forthNumber == 0;

            if (first && second && third && forth) {
                System.out.print(i + " ");
            }
        }

    }

}
