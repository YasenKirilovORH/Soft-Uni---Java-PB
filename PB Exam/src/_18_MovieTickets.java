import java.util.Scanner;

public class _18_MovieTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = a1; symbol1 <= a2 - 1; symbol1++) {

            for (int symbol2 = 1; symbol2 <= n - 1; symbol2++) {

                for (int symbol3 = 1; symbol3 <= n / 2 - 1; symbol3++) {

                    if (symbol1 % 2 != 0 && (symbol2 + symbol3 + symbol1) % 2 != 0) {

                        // "{Символ 1}-{Символ 2}{Символ 3}{Символ  4}"
                        // вариянт 1
                        // String symbol1AsString = symbol1 + "";
                        // char symbol1AsChar = symbol1AsString.charAt(0);

                        System.out.printf("%c-%d%d%d\n", symbol1, symbol2, symbol3, symbol1);
                    }
                }
            }
        }

    }

}
