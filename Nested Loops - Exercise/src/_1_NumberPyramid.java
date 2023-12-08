import java.util.Scanner;

public class _1_NumberPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int rows = 1; rows <= n; rows++) {

            for (int number = 1; number <= rows; number++) {
                if (num > n) {
                    break;
                }
                System.out.print(num + " ");
                num++;
            }

            if (num > n) {
                break;
            }

            System.out.println();

        }

    }

}

