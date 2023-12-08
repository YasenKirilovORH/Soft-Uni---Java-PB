import java.util.Scanner;

public class _39_MultiplyBy2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double result = 0;

        while (input >= 0) {

            result = input * 2;


            System.out.printf("Result: %.2f%n", result);
            input = Double.parseDouble(scanner.nextLine());

        if (input < 0) {
            break;
        }


        }
        if (input < 0) {
            System.out.println("Negative number!");
        }

    }
}

