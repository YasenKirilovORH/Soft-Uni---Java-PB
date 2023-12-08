import java.util.Scanner;

public class _5_SuppliesforSchool {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        int pens = Integer.parseInt (scanner.nextLine());
        int markers = Integer.parseInt (scanner.nextLine());
        int cleaningDetergent = Integer.parseInt (scanner.nextLine());
        int discount = Integer.parseInt (scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleaningDetergentPrice = cleaningDetergent * 1.20;
        double totalPrice = pensPrice + markersPrice + cleaningDetergentPrice;

        double totalPriceWithDiscount = totalPrice - (totalPrice * (discount / 100.00));

        System.out.println (totalPriceWithDiscount);




    }

}
