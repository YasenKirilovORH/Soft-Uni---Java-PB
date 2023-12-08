import java.util.Scanner;

public class _16_FlowerShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int zumbul = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());

        double priceMagnolias = magnolias * 3.25;
        double priceZumbul = zumbul * 4;
        double priceRoses = roses * 3.50;
        double priceCactuses = cactuses * 8;

        double totalSum = priceMagnolias + priceZumbul + priceRoses + priceCactuses;
        double totalSumAfterVat = totalSum - (totalSum * 0.05);

        if (totalSumAfterVat >= priceOfGift){
            System.out.printf("She is left with %.0f leva.", Math.floor(totalSumAfterVat - priceOfGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceOfGift - totalSumAfterVat));
        }

    }

}
