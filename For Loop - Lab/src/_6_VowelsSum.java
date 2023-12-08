import java.util.Scanner;

public class _6_VowelsSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;

        for (int letter = 0; letter <= text.length() - 1; letter++) {

            char symbol = text.charAt(letter);

            switch (symbol) {
                case ('a'):
                    sum = sum + 1;
                    break;
                case ('e'):
                    sum = sum + 2;
                    break;
                case ('i'):
                    sum = sum + 3;
                    break;
                case ('o'):
                    sum = sum + 4;
                    break;
                case ('u'):
                    sum = sum + 5;
                    break;

            }


        }
        System.out.println(sum);
    }
}
