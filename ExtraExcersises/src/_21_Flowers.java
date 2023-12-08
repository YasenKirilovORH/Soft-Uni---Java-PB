import java.util.Scanner;

public class _21_Flowers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0.00;
        double rosesPrice = 0.00;
        double tulipsPrice = 0.00;
        double totalFlowers = chrysanthemums + roses + tulips;
        int arangement = 2;


        switch (season) {
            case ("Spring"):
            case ("Summer"):
                chrysanthemumsPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;
                break;
            case ("Autumn"):
            case ("Winter"):
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
                break;
        }
        double bucketPrice = (chrysanthemums * chrysanthemumsPrice) + (roses * rosesPrice) + (tulips * tulipsPrice);

        if (holiday.equals("Y")) {
            bucketPrice = bucketPrice + (bucketPrice * 0.15);
        }
        if (tulips > 7 && season.equals("Spring")) {
            bucketPrice = bucketPrice - (bucketPrice * 0.05);
        }
        if (roses >= 10 && season.equals("Winter")) {
            bucketPrice = bucketPrice - (bucketPrice * 0.10);
        }
        if (totalFlowers > 20) {
            bucketPrice = bucketPrice - (bucketPrice * 0.20);

        }
        double finalPrice = bucketPrice + arangement;
        System.out.printf("%.2f", finalPrice);
    }
}
