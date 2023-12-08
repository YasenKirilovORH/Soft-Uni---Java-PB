import java.util.Scanner;

public class _10_Skeleton {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int controlMins = Integer.parseInt(scanner.nextLine());
        int controlSecs = Integer.parseInt(scanner.nextLine());
        double trackLength = Double.parseDouble(scanner.nextLine());
        int secsFor100m = Integer.parseInt(scanner.nextLine());

        int totalControlInSecs = controlMins * 60 + controlSecs;
        double delay = (trackLength / 120) * 2.5;

        double racerTime = (trackLength / 100) * secsFor100m - delay;

        if (racerTime <= totalControlInSecs) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", racerTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(totalControlInSecs - racerTime));
        }

    }

}
