import java.util.Scanner;

public class _9_LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int difference = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + difference);
        }
    }
}