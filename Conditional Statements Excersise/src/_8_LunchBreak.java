import java.util.Scanner;

public class _8_LunchBreak {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int brakeTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = brakeTime / 8.0;
        double restTime = brakeTime / 4.0;
        double timeLeft = brakeTime - (lunchTime + restTime);


        if (duration <= timeLeft){
            System.out.printf ("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - duration));
        } else {
            System.out.printf ("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(duration - timeLeft));
        }

    }

}
