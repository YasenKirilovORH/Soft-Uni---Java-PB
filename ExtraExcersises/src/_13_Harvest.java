import java.util.Scanner;

public class _13_Harvest {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int totalSquareMeters = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededLitersWine = Integer.parseInt(scanner.nextLine());
        int neededWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrape = totalSquareMeters * grapePerSquareMeter;
        double wine = Math.floor(totalGrape * 0.40) / 2.5;
        double difference = Math.ceil (wine - neededLitersWine);
        double winePerPerson = Math.ceil (difference / neededWorkers);

        if (wine >= neededLitersWine) {
            System.out.printf ("Good harvest this year! Total wine: %.0f liters.%n", wine);
            System.out.printf ("%.0f liters left -> %.0f liters per person.", difference, winePerPerson);
        } else {
            System.out.printf ("It will be a tough winter! More %.0f liters wine needed.", Math.floor (Math.abs(difference)));
        }



    }

}
