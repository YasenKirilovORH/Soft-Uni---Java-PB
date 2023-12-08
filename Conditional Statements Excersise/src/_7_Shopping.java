import java.util.Scanner;

public class _7_Shopping {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int CPU = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250.00;
        double CPUPrice = (videoCards * videoCardPrice) * 0.35;
        double RAMPrice = (videoCards * videoCardPrice) * 0.10;

        double totalPrice = (videoCards * videoCardPrice) + (CPU * CPUPrice) + (RAM * RAMPrice);

        if (videoCards > CPU) {
            totalPrice = totalPrice * 0.85;
            }
            if (budget >= totalPrice){

                System.out.printf ("You have %.2f leva left!", budget - totalPrice);
            }   else System.out.printf ("Not enough money! You need %.2f leva more!", totalPrice - budget);{

            }

        }

    }

