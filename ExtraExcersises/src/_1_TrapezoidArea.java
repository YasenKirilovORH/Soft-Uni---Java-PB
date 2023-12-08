import java.util.Scanner;

public class _1_TrapezoidArea {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        double lengthA = Double.parseDouble(scanner.nextLine());
        double lengthB = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble (scanner.nextLine());

        double area = ((lengthA + lengthB) * height/2);

        System.out.printf ("%.2f" , area);


    }

}
