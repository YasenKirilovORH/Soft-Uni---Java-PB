import java.util.Scanner;

public class _4_FishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0.00;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fisherman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;

            case "Summer":
                boatPrice = 4200;
                if (fisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fisherman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;

            case "Autumn":
                boatPrice = 4200;
                if (fisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fisherman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                break;

            case "Winter":
                boatPrice = 2600;
                if (fisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fisherman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fisherman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;
                }
                if (budget > boatPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
                }


        }

    }


