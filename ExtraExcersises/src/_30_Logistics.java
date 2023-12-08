import java.util.Scanner;

public class _30_Logistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCargos = Integer.parseInt(scanner.nextLine());
        int bus = 0;
        int truck = 0;
        int train = 0;


        for (int cargo = 1; cargo <= numberOfCargos; cargo++) {

            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                bus += tons;
            } else if (tons <= 11) {
                truck += tons;
            } else {
                train+= tons;
            }

        }
        int sumBus = bus * 200;
        int sumTruck = truck * 175;
        int sumTrain = train * 120;

        int sumOfCargos = bus + truck + train;
        double averagePricePerTon = (double) (sumBus + sumTruck + sumTrain) / sumOfCargos;

        double percentOfCargosWithBus = ((double) bus / sumOfCargos) * 100;
        double percentOfCargosWithTruck = ((double) truck / sumOfCargos) * 100;
        double percentOfCargosWithTrain = ((double) train / sumOfCargos) * 100;

        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n", percentOfCargosWithBus);
        System.out.printf("%.2f%%%n", percentOfCargosWithTruck);
        System.out.printf("%.2f%%%n", percentOfCargosWithTrain);


    }

}
