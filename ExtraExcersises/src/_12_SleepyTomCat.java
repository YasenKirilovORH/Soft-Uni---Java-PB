import java.util.Scanner;

public class _12_SleepyTomCat {

    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        int offDays = Integer.parseInt(scanner.nextLine());

        int minutesForPlayInOffDays = offDays * 127;
        int minutesForPlayInWorkingDays = (365 - offDays) * 63;
        int totalMinutesForPlay = minutesForPlayInOffDays + minutesForPlayInWorkingDays;
        int minutesDifference = Math.abs (totalMinutesForPlay - 30000);
        int hours = minutesDifference / 60;
        int minutes = minutesDifference % 60;

        if (totalMinutesForPlay <= 30000){
            System.out.printf("Tom sleeps well %n");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }

}
