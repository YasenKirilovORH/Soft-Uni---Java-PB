import java.util.Scanner;

public class _3_Combinations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int n1 = 0; n1 <= number; n1++) {

            for (int n2 = 0; n2 <= number; n2++) {

                for (int n3 = 0; n3 <= number; n3++) {

                    if (n1 + n2 + n3 == number) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
