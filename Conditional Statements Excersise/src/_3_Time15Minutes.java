import java.util.Scanner;

public class _3_Time15Minutes {


    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        if (minutes >= 60){
            minutes = minutes - 60;
            hours = hours + 1;

        } if (hours >= 24){
            hours = hours - 24;

        }
        System.out.printf ("%d:%02d", hours, minutes);


    }


}

