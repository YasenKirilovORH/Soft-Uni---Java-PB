import java.util.Scanner;

public class _4_InchesToCentimeters {

    public static void main (String[] args){

       Scanner scanner = new Scanner (System.in);

       double number = Double.parseDouble(scanner.nextLine());
       double cm = number * 2.54;

       System.out.println (cm);


    }

}
