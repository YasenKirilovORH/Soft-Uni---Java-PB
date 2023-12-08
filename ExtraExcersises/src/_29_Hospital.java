import java.util.Scanner;

public class _29_Hospital {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int periodOfDays = Integer.parseInt(scanner.nextLine());
        int watched = 0;
        int unwatched = 0;
        int doctors = 7;

        for (int period = 1; period <= periodOfDays; period++) {
            if (period % 3 == 0) {
                if (watched < unwatched) {
                    doctors++;
                }
            }

            int numberOfPatientsPerDay = Integer.parseInt(scanner.nextLine());

            if (numberOfPatientsPerDay > doctors) {
                unwatched += numberOfPatientsPerDay - doctors;
            }
            if (numberOfPatientsPerDay < doctors) {
                watched += numberOfPatientsPerDay;
            } else {
                watched += doctors;
            }

        }
        System.out.printf("Treated patients: %d.%n", watched);
        System.out.printf("Untreated patients: %d.%n", unwatched);
    }

}
