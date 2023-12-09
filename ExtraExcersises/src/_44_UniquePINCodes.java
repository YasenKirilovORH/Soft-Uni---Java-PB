import java.util.Scanner;

public class _44_UniquePINCodes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int borderFirstNum = Integer.parseInt(scanner.nextLine());
        int borderSecondNum = Integer.parseInt(scanner.nextLine());
        int borderThirdNum = Integer.parseInt(scanner.nextLine());

        boolean simple = true;

        int count = 1;

        for (int i = 2; i <= borderFirstNum; i++) {
            for (int j = 2; j <= borderSecondNum; j++) {
                simple = true;
                if (j > 1) {
                    count = 1;
                    for (int k = 2; k <= borderSecondNum; k++) {
                        if (j % k == 0) {
                            count++;
                            if (count == 3) {
                                simple = false;
                                break;
                            }
                        }
                    }
                }
                for (int k = 1; k <= borderThirdNum; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && simple && count == 2) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }

    }

}

