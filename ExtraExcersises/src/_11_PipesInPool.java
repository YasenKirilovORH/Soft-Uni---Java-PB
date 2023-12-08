import java.util.Scanner;

public class _11_PipesInPool {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double P1PerHours = P1 * hours;
        double P2PerHours = P2 * hours;
        double pipesSum = P1PerHours + P2PerHours;
        double P1Percent = P1 * hours / pipesSum * 100;
        double P2Percent = P2 * hours / pipesSum * 100;
        double totalPercent = pipesSum / capacity * 100;

        if (pipesSum <= capacity){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent, P1Percent, P2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(pipesSum - capacity));
        }
    }

}
