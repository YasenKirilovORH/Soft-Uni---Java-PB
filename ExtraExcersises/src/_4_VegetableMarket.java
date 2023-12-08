import java.util.Scanner;

public class _4_VegetableMarket {

    public static void main (String[]args){

        Scanner scanner = new Scanner (System.in);

        double priceVegetables = Double.parseDouble (scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double totalSumBGN = (priceVegetables * kgVegetables) + (priceFruits * kgFruits);
        double totalSumEUR = totalSumBGN / 1.94;

        System.out.printf ("%.2f", totalSumEUR);


    }

}
