import java.util.Scanner;

public class _9_YardGreening {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        double sqrMeters = Double.parseDouble(scanner.nextLine());
        double totalPrice = sqrMeters * 7.61;
        double discount = totalPrice * 0.18;
        double finalPrice = totalPrice - discount;

        System.out.printf ("The final price is: %.2f lv. %n The discount is: %.2f lv.", finalPrice, discount);

    }



}
