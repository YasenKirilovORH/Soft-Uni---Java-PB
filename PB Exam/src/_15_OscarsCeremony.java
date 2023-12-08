import java.util.Scanner;

public class _15_OscarsCeremony {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double prizes = rent * 0.70;
        double catering = prizes * 0.85;
        double sound = catering / 2;

        double sum = rent + prizes+ catering + sound;

        System.out.printf("%.2f", sum);

    }
}
