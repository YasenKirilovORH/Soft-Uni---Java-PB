import java.util.Scanner;

public class _44_UniquePINCodes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ceilFirstNum = Integer.parseInt(scanner.nextLine());
        int ceilSecondNum = Integer.parseInt(scanner.nextLine());
        int ceilThirdNum = Integer.parseInt(scanner.nextLine());

        boolean simple = true;
        int count = 1;

        for (int i = 1; i <= ceilFirstNum; i++){
            for (int j = 2; j <= ceilSecondNum; j++) {
                simple = true;
                if (j > 1) {
                    count = 1;
                    for (int k = 2; k <= ceilSecondNum; k++) {
                        if (j % k == 0) {
                            count++;
                            if (count == 3) {
                                simple = false;
                                break;
                            }
                        }

                    }
                }
                for (int k = 1; k <= ceilThirdNum; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && simple && count == 2) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }

}
