import java.util.Scanner;

public class _7_FoodDelivery {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        int chickenMenu = Integer.parseInt (scanner.nextLine());
        int fishMenu = Integer.parseInt (scanner.nextLine());
        int vegMenu = Integer.parseInt (scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegMenuPrice = vegMenu * 8.15;

        double totalAmount = chickenMenuPrice + fishMenuPrice + vegMenuPrice;
        double desertPrice = totalAmount * 20/100;
        double deliveryPrice = 2.50;

        double finalPrice = totalAmount + desertPrice + deliveryPrice;

        System.out.println (finalPrice);

    }

}
