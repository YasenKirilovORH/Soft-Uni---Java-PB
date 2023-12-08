import java.util.Scanner;

public class _6_Fishland {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double pricePalamud = priceSkumria + (priceSkumria * 0.60);
        double priceSafrid = priceCaca + (priceCaca * 0.80);
        double priceMidi = 7.50;

        double totalPrice = kgPalamud * pricePalamud + kgSafrid * priceSafrid + kgMidi * priceMidi;
        System.out.printf ("%.2f", totalPrice);

    }

}
